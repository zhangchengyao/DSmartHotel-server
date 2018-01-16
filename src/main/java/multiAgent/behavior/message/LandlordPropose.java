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
import multiAgent.ontology.Bid;
import multiAgent.ontology.BidOntology;

/**
 * Created by H77 on 2017/5/8.
 */
public class LandlordPropose extends OneShotBehaviour{

    private Codec codec = new SLCodec();
    private Ontology ontology = BidOntology.getInstance();
    private Bid bid = null;
    // type 0 : reject   type 1 : accept
    private AID receive;
    public LandlordPropose(Agent agent, Bid bid, AID receive){
        super(agent);
        this.bid = bid;
        this.receive = receive;
    }
    public void action() {
        ACLMessage reply = new ACLMessage(ACLMessage.PROPOSE);
        reply.setLanguage(codec.getName());
        reply.setOntology(ontology.getName());

        reply.addReceiver(receive);
        Action info = new Action();
        info.setActor(myAgent.getAID());
        info.setAction(bid);
        try {
            myAgent.getContentManager().fillContent(reply,info);
        } catch (Codec.CodecException e) {
            e.printStackTrace();
        } catch (OntologyException e) {
            e.printStackTrace();
        }
        myAgent.send(reply);

    }

}
