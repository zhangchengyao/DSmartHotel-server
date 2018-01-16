package multiAgent.behavior.message;

import jade.content.lang.Codec;
import jade.content.lang.sl.SLCodec;
import jade.content.onto.Ontology;
import jade.content.onto.OntologyException;
import jade.content.onto.basic.Action;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import multiAgent.ontology.BidOntology;
import multiAgent.ontology.Order;
import multiAgent.agentHelper.DFUtil;

/**
 * Created by H77 on 2017/5/6.
 */
public class TenantRequest extends OneShotBehaviour {

    private Codec codec = new SLCodec();
    private Ontology ontology = BidOntology.getInstance();
    private Order order = null;

    public TenantRequest(Agent agent, Order order){
        super(agent);
        this.order = order;
    }
    public void action() {
        //随机查找一个协商Agent 发送请求
        AID aid = DFUtil.searchServiceAgent(myAgent,"consult");
        ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
        Action act = new Action();
        act.setActor(myAgent.getAID());
        act.setAction(order);
        msg.addReceiver(aid);
        msg.setLanguage(codec.getName());
        msg.setOntology(ontology.getName());
        try {
            myAgent.getContentManager().fillContent(msg,act);
            myAgent.send(msg);
        } catch (Codec.CodecException e) {
            e.printStackTrace();
        } catch (OntologyException e) {
            e.printStackTrace();
        }
    }
}
