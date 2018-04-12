package application.multiAgent.behavior.listener;

import application.DO.Landlord;
import application.DO.Tenant;
import application.vo.BidInfo;
import application.vo.Consult;
//import dao.daoImpl.landlordDao;
import jade.content.ContentElement;
import jade.content.lang.Codec;
import jade.content.lang.sl.SLCodec;
import jade.content.onto.Ontology;
import jade.content.onto.OntologyException;
import jade.content.onto.UngroundedException;
import jade.content.onto.basic.Action;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.util.leap.ArrayList;
import application.multiAgent.agent.TenantAgent;
import application.multiAgent.agentHelper.ValueCal;
import application.multiAgent.behavior.message.Negotiation;
import application.multiAgent.ontology.*;
import jade.util.leap.List;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by H77 on 2017/5/6.
 */
public class TenantListener extends CyclicBehaviour {

    private Codec codec = new SLCodec();
    private Ontology ontology = BidOntology.getInstance();
    private int responseNum = 0;
    private int lowerPriceNum = 0;
    private int currentResponse = 0;
    private List bids = new ArrayList();            //用于下次的negotiation
    private List finalBids = new ArrayList();       //不再降价的bid
    private List allbids = new ArrayList();         //用于存储全部的Bid信息
    private Map<AID, Bid> mapped = new HashMap<AID, Bid>();
    private ValueCal cal = null;
    private TenantAgent agent;

    public TenantListener(Agent agent, ValueCal c) {
        super(agent);
        this.agent = (TenantAgent) agent;
        cal = c;
    }

    public void action() {
        MessageTemplate mt = MessageTemplate.and(
                MessageTemplate.MatchLanguage(codec.getName()),
                MessageTemplate.MatchOntology(ontology.getName()));
        ACLMessage msg = myAgent.receive();
        if (msg != null) {
            if (msg.getPerformative() == ACLMessage.INFORM) {
                //得到返回的房东竞标集合，下一步是与房东之间的智能讨价还价过程
                System.out.println(myAgent.getName() + " 收到筛选结果");
                try {
                    ContentElement ce = myAgent.getContentManager().extractContent(msg);
                    Action act = (Action) ce;
                    if (act.getAction() instanceof OrderResponse) {
                        OrderResponse orderResponse = (OrderResponse) act.getAction();
                        //完成映射表
                        if (orderResponse == null || orderResponse.getBids() == null) {
                            System.out.println("没有符合意向的房源");
                        } else {
                            for (int i = 0; i < orderResponse.getBids().size(); i++) {
                                Bid bid = (Bid) orderResponse.getBids().get(i);
                                mapped.put(bid.getLandlordId(), bid);
                            }
                            allbids = orderResponse.getBids();      //保存全部的Bid信息
                            //according to Tenant preference to choose some bids
                            Tenant thistenant = ((TenantAgent) myAgent).getOwner();
                            Order order = ((TenantAgent) myAgent).getOrder(thistenant.getId());
                            cal.initPrice(orderResponse.getBids());
                            List response = cal.ScreenBids(orderResponse.getBids(), thistenant, order, false, myAgent);
//                            List response = cal.bidvalue(orderResponse.getBids());
                            if (response == null) {
                                if (cal.getGoodBid().size() == 1) {         //just one good Bid; and put the result in the LinkedBlockingQueue
                                    //return the Bid that is accepted
                                    java.util.List<BidInfo> resultBids = this.creatBidInfo(cal.getGoodBid());
                                    agent.putResult(resultBids);
                                    application.multiAgent.behavior.message.Negotiation neg = new application.multiAgent.behavior.message.Negotiation(myAgent,allbids,"",true);
                                    myAgent.addBehaviour(neg);
//                                    agent.doDelete();      //clear the agent
                                } else {
                                    //reject all the Bid
                                    System.out.println("reject all bids!!");
                                }
                            } else {
                                responseNum = response.size();
                                myAgent.addBehaviour(new application.multiAgent.behavior.message.Negotiation(myAgent, response, order.getId(),false));
                            }
//                            responseNum = orderResponse.getBids().size();
//                            myAgent.addBehaviour(new Negotiation(myAgent, orderResponse.getBids()));

                        }
                    }
                } catch (Codec.CodecException e) {
                    e.printStackTrace();
                } catch (UngroundedException e) {
                    e.printStackTrace();
                } catch (OntologyException e) {
                    e.printStackTrace();
                }
            } else if (msg.getPerformative() == ACLMessage.ACCEPT_PROPOSAL) {
                //收到房源的回应
                currentResponse++;
                try {
                    ContentElement ce = myAgent.getContentManager().extractContent(msg);
                    Action act = (Action) ce;
                    if (act.getAction() instanceof application.multiAgent.ontology.Negotiation) {
                        application.multiAgent.ontology.Negotiation negotiation = (application.multiAgent.ontology.Negotiation) act.getAction();
                        if (negotiation.getResult() == 1) {       //diminish the price        //and these bids will be calculate scores
                            System.out.println("房源" + msg.getSender().getName() + "接收降价");
                            System.out.println("降低到" + negotiation.getActualPrice());
                            lowerPriceNum++;
                            Bid tempbid = mapped.get(msg.getSender());
                            tempbid.setPrice(negotiation.getActualPrice());
                            mapped.put(msg.getSender(), tempbid);        //覆盖negotiation后的bid

                            this.setConsult(tempbid, negotiation.getActualPrice(), true);
                            bids.add(tempbid);
                        } else if (negotiation.getResult() == 0) {        //don't diminish the price
                            // stop calculating the score and if it is good ,the GoodBid had one in the last process of calculate scores
                            System.out.println("房源" + msg.getSender().getName() + "拒绝降价");
                            Bid tempbid = mapped.get(msg.getSender());

                            this.setConsult(tempbid, 0, false);
                            finalBids.add(tempbid);
                        } else {
                            // stop calculating the score and if it is good ,the GoodBid had one in the last process of calculate scores
                            System.out.println("房源" + msg.getSender().getName() + "未响应降价");
                            Bid tempbid = mapped.get(msg.getSender());

                            this.setConsult(tempbid, 0, false);
                            finalBids.add(tempbid);
                        }   //对于后两者不再进行讨价还价
                    }

                    if (currentResponse == responseNum) {
                        //收到全部的回复
                        if (lowerPriceNum == 0) {
                            //所有房源都不降价
                            System.out.println("所有房源都不降价了");
                            //返回现在的最好的房源
                            java.util.List<BidInfo> resultBids = this.creatBidInfo(cal.getGoodBid());
                            agent.putResult(resultBids);
                            Negotiation neg = new application.multiAgent.behavior.message.Negotiation(myAgent,allbids,"",true);
                            myAgent.addBehaviour(neg);

                        } else {
                            System.out.print("再次协商！！");
                            lowerPriceNum = 0;
                            currentResponse = 0;
                            Tenant t = agent.getOwner();
                            Order order = agent.getOrder(t.getId());
                            List results = cal.ScreenBids(bids, t, order, true, myAgent);
                            if (results == null) {
                                java.util.List<BidInfo> resultBids = this.creatBidInfo(cal.getGoodBid());

                                agent.putResult(resultBids);
                                application.multiAgent.behavior.message.Negotiation neg = new application.multiAgent.behavior.message.Negotiation(myAgent,allbids,order.getId(),true);
                                myAgent.addBehaviour(neg);
//                                agent.doDelete();         //clear the agent
                            } else {
                                responseNum = results.size();
                                myAgent.addBehaviour(new application.multiAgent.behavior.message.Negotiation(myAgent, results, order.getId(),false));
                                bids.clear();
                            }
                        }
                    }

                } catch (Codec.CodecException e) {
                    e.printStackTrace();
                } catch (OntologyException e) {
                    e.printStackTrace();
                }
            } else {
                //用来测试的
                String content = msg.getContent();
                System.out.println("房客Agent：" + content);
            }
            /*
              可以扩展监听其它类型的Message
             */
        } else {
            block();
        }
    }

    private void setConsult(Bid bid, int actual, boolean pass) {
        int landlordid = bid.getRoom().getLandlordId();
        java.util.List<Consult> consults = ((TenantAgent) myAgent).getConsult(landlordid);
        Consult oneConsult = consults.get(consults.size() - 1);
        Consult result;
        if (pass) {   //pass the Negotiation
            result = new Consult(oneConsult.getTenantName(), oneConsult.getLandlordName(), oneConsult.getMinReduction(), oneConsult.getMaxReduction(), 1, oneConsult.getBidLevel(), actual);
        } else {  //reject the reduction
            result = new Consult(oneConsult.getTenantName(), oneConsult.getLandlordName(), oneConsult.getMinReduction(), oneConsult.getMaxReduction(), 2, oneConsult.getBidLevel(), oneConsult.getActualPrice());
        }
        consults.add(result);
        ((TenantAgent) myAgent).setConsult(landlordid,consults);
    }

    public java.util.List<BidInfo> creatBidInfo(List GoodBid) {
        java.util.List<BidInfo> resultBidInfo = new java.util.ArrayList<BidInfo>();
        for (int i = 0; i < cal.getGoodBid().size(); i++) {
            Bid bid = (Bid) cal.getGoodBid().get(i);
            Room r = bid.getRoom();
//            Landlord l =  landlordDao.findlandlordByid(r.getLandlordId());
            Landlord l = new Landlord();
            java.util.List<String> facilitys = new java.util.ArrayList<String>();
            for(int j = 0 ; j <bid.getFacilities().size() ; j++){
                facilitys.add((String)bid.getFacilities().get(j));
            }
            BidInfo info = new BidInfo(l.getLandlordname(),l.getLandlordtype(),r.getType(),bid.getPrice()+"",r.getPrice()+"",bid.getNum(),facilitys,((TenantAgent) myAgent).getConsult(l.getLandlordid()));
            info.setScore((Integer)cal.getGoodScore().get(i));
            info.setLocation(l.getDetailaddress());
            resultBidInfo.add(info);
        }
        return resultBidInfo;
    }

}
