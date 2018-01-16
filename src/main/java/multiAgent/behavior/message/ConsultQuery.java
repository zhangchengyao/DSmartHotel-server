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
public class ConsultQuery extends OneShotBehaviour {

    private Codec codec = new SLCodec();
    private Ontology ontology = BidOntology.getInstance();
    private Order order = null;

    public ConsultQuery(Agent agent, Order order){
        super(agent);
        this.order = order;
    }
    public void action() {
        //下面是传递到selectAgent 先去df中搜索相应的select
        AID aid = DFUtil.searchServiceAgent(myAgent, "select");
        //搜索结束，组装传输的action
        Action sendAct = new Action();
        sendAct.setActor(myAgent.getAID());
        sendAct.setAction(order);
        //action组装完成，组装aclmessage
        ACLMessage al = new ACLMessage(ACLMessage.QUERY_REF);
        al.addReceiver(aid);
        al.setLanguage(codec.getName());
        al.setOntology(ontology.getName());
        try {
            myAgent.getContentManager().fillContent(al, sendAct);
            //发消息
            myAgent.send(al);
        } catch (Codec.CodecException e) {
            e.printStackTrace();
        } catch (OntologyException e) {
            e.printStackTrace();
        }
    }
}
