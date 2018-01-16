package multiAgent.agent;

import DO.landlord;
import jade.content.lang.Codec;
import jade.content.lang.sl.SLCodec;
import jade.content.onto.Ontology;
import jade.core.AID;
import jade.core.Agent;

import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;
import multiAgent.agentHelper.LandlordCompare;
import multiAgent.behavior.listener.SelectListener;
import multiAgent.ontology.Bid;
import multiAgent.ontology.BidOntology;
import multiAgent.ontology.OrderResponse;
import multiAgent.agentHelper.DFUtil;

import java.util.*;
import java.util.concurrent.CountDownLatch;


/**
 * Created by zy on 17/5/6.
 */
public class SelectAgent extends Agent {

    private Codec codec = new SLCodec();
    private Ontology ontology = BidOntology.getInstance();
    //暂时将AID作为Key
    private Map<String,OrderResponse> store = new HashMap<String,OrderResponse>();
    //用来计数reply数，暂时也将AID作为Key
    private Map<String,Integer> counts = new HashMap<String, Integer>();
    //用来存储询问的房东Agent
    private Map<AID,landlord> landlordMaps = new HashMap<AID, landlord>();


    //setup方法，负责为agent各个属性赋值，并且注册到dfAgent上
    protected void setup() {
        getContentManager().registerLanguage(codec);
        getContentManager().registerOntology(ontology);
        System.out.println("创建 SelectAgent");
        DFUtil.registerService(this,"select");
        addBehaviour(new SelectListener(this));
    }
    public void setOrderResponse(String orderId, OrderResponse response){
        store.put(orderId,response);
        counts.put(orderId,0);
    }
    public  boolean isAllReply(String orderId,Bid bid){
        int replys = counts.get(orderId)+1;
        counts.put(orderId,replys);
        OrderResponse response = store.get(orderId);
        if(bid.getType() == 1) response.addBid(bid);
        if(replys == response.getResponseNum()){
            return true;
        }
        return false;
    }
    public  OrderResponse getAndRemove(String id){
        OrderResponse order = store.get(id);
        store.remove(id);
        counts.remove(id);
        return order;
    }

    public List<AID> createAgent(List<LandlordCompare> lists){
        AgentContainer c = getContainerController();
        List<AID> aids = new ArrayList<AID>();
        landlord land = null;
        CountDownLatch count = new CountDownLatch(lists.size());
        try {
            for(LandlordCompare compare : lists) {
                land = compare.getLand();
                String name = land.getLandlordname();
                if(!this.landlordMaps.containsKey(new AID(land.getLandlordname(),false))) {
                    this.landlordMaps.put(new AID(land.getLandlordname(), false), land);
                }
                AgentController agent = c.createNewAgent(name, "multiAgent.agent.LandlordAgent", new Object[]{land,count});
                AID id = new AID(name,false);
                aids.add(id);
                agent.start();
            }
            //阻塞至所有landlordAgent启动完成，如果15S内未完成也直接返回。
            //目的是在发信息时 Agent都已经初始完成了
            try {
//                count.await(15, TimeUnit.SECONDS);
                count.await();
                System.out.println("----managerAgent创建完成landlordAgent----");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
        return aids;
    }

    public landlord getLandLord(AID id){
        return landlordMaps.get(id);
    }
    public Map<AID, landlord> getLandlordMaps() {
        return landlordMaps;
    }

    public void setLandlordMaps(Map<AID, landlord> landlordMaps) {
        this.landlordMaps = landlordMaps;
    }

}
