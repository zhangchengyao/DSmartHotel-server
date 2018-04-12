package application.multiAgent.agent;

import application.DO.Landlord;
import jade.content.lang.Codec;
import jade.content.lang.sl.SLCodec;
import jade.content.onto.Ontology;
import jade.core.Agent;
import application.multiAgent.behavior.listener.LandlordListener;
import application.multiAgent.ontology.BidOntology;
import application.multiAgent.ontology.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/**
 * Created by H77 on 2017/5/6.
 */
public class LandlordAgent extends Agent{

    //营销策略
    private Codec codec = new SLCodec();
    private Ontology ontology = BidOntology.getInstance();
    private Landlord owner = null;
    //LandlordAgent 生命周期
    private Map<String,Order> orderToNegotiate;

    protected void setup() {
        getContentManager().registerLanguage(codec);
        getContentManager().registerOntology(ontology);
        setEnabledO2ACommunication(true,10);
        //args[0]是landlord  args[1]是countDownBatch
        Object[] args = getArguments();
//        DFUtil.registerService(this,"Landlord");
        addBehaviour(new LandlordListener(this));
        if (args.length > 0) {
            owner = (Landlord) args[0];
            CountDownLatch count = (CountDownLatch)args[1];
            System.out.println("创建landlordAgent "+ owner.getLandlordname());
            orderToNegotiate = new HashMap<String, Order>();
            count.countDown();
        }
    }
    public void takeDown(){
        System.out.println("LandlordAgent "+owner.getLandlordname()+"  被销毁");
        setEnabledO2ACommunication(false,0);
    }

    public Landlord getOwner(){
        return owner;
    }

    public Map<String, Order> getOrderToNegotiate() {
        return orderToNegotiate;
    }




}
