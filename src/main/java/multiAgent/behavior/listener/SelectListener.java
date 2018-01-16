package multiAgent.behavior.listener;

import DO.landlord;
import jade.content.ContentElement;
import jade.content.lang.Codec;
import jade.content.lang.sl.SLCodec;
import jade.content.onto.Ontology;
import jade.content.onto.OntologyException;
import jade.content.onto.basic.Action;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import multiAgent.agent.SelectAgent;
import multiAgent.behavior.logical.SelectAnalysis;
import multiAgent.behavior.message.SelectInform;
import multiAgent.ontology.*;
import util.MapUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by zy on 17/5/6.
 */
public class SelectListener extends CyclicBehaviour {

    private Codec codec = new SLCodec();
    private Ontology ontology = BidOntology.getInstance();
    private SelectAgent agent;
    public SelectListener(Agent agent){
         super(agent);
         this.agent = (SelectAgent) agent;
    }

    public void action() {
        MessageTemplate mt = MessageTemplate.and(
                MessageTemplate.MatchLanguage(codec.getName()),
                MessageTemplate.MatchOntology(ontology.getName()));
        ACLMessage msg = myAgent.receive(mt);
        if (msg != null) {
            try {
                if(msg.getPerformative() == ACLMessage.QUERY_REF) {
                    ContentElement ce = myAgent.getContentManager().extractContent(msg);
                    Action act = (Action) ce;
                    if (act.getAction() instanceof Order) {
                        Order o = (Order) act.getAction();
                        System.out.println("select"+myAgent.getName()+"收到筛选条件信息" + o.getAddress());
                        /**
                         * todo
                         * 下面是去查询并且筛选数据，然后生成招标书，并且发送给房东agent
                         */
                        myAgent.addBehaviour(new SelectAnalysis(agent,o));
                    }
                }else if( msg.getPerformative() == ACLMessage.PROPOSE){
                    ContentElement ce = myAgent.getContentManager().extractContent(msg);
                    Action act = (Action) ce;
                    Bid bid = (Bid) act.getAction();
                    if(bid.getType() == 1) {
                        //如果同意竞标 bid中添加周边信息
                        landlord land = agent.getLandLord(bid.getLandlordId());
                        List<String> keywords = new ArrayList<String>();
                        keywords.add("景点");
                        keywords.add("超市");
                        keywords.add("公交");
                        Map<String,List<MapObject>> maps = MapUtil.searchAroundSite(keywords,land.getLongitude().toString(),land.getLatitude().toString());
                        jade.util.leap.List aroundsites = new jade.util.leap.ArrayList();
                        for(String key : keywords){
                            List<MapObject> lists = maps.get(key);
                            MapObjects object = new MapObjects();

                            jade.util.leap.List objects = new jade.util.leap.ArrayList();
                            for(MapObject ob : lists){
                                 objects.add(ob);
                            }
                            object.setKeyWords(key);
                            object.setObjects(objects);
                            aroundsites.add(object);
                        }
                        bid.setAroundsites(aroundsites);
                        System.out.println(bid.getLandlordId().getName() + " 同意竞标");
                    }else{
                        System.out.println(bid.getLandlordId().getName() +" 拒绝竞标");
                    }
                    boolean isAll = agent.isAllReply(bid.getId(),bid);
                    if(isAll){
                        OrderResponse order = agent.getAndRemove(bid.getId());
                        //以下代码为将OrderResponse返回给房客Agent
                        myAgent.addBehaviour(new SelectInform(myAgent,order));
                    }
                }
                /*
                  可扩展其它Message种类
                */
            } catch (Codec.CodecException e) {
                e.printStackTrace();
            } catch (OntologyException e) {
                e.printStackTrace();
            }
        } else {
            block();
        }

    }
}
