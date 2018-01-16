package multiAgent.behavior.message;

import jade.content.lang.Codec;
import jade.content.lang.sl.SLCodec;
import jade.content.onto.Ontology;
import jade.content.onto.OntologyException;
import jade.content.onto.basic.Action;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import multiAgent.agent.SelectAgent;
import multiAgent.ontology.BidOntology;
import multiAgent.ontology.OrderResponse;

/**
 * Created by H77 on 2017/5/6.
 */
public class SelectInform extends OneShotBehaviour {

    private Codec codec = new SLCodec();
    private Ontology ontology = BidOntology.getInstance();
    private SelectAgent agent;
    private OrderResponse response;
    public SelectInform(Agent agent, OrderResponse order){
        super(agent);
        this.agent = (SelectAgent)agent;
        response = order;
    }
    public void action() {
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.addReceiver(response.getSource());
        Action act = new Action();
        act.setActor(agent.getAID());
        act.setAction(response);
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
