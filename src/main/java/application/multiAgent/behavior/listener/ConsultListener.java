package application.multiAgent.behavior.listener;

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
import application.multiAgent.behavior.message.ConsultQuery;
import application.multiAgent.ontology.BidOntology;
import application.multiAgent.ontology.Order;

/**
 * Created by zy on 17/5/6.
 */
public class ConsultListener extends CyclicBehaviour {

    private Codec codec = new SLCodec();
    private Ontology ontology = BidOntology.getInstance();

    public ConsultListener(Agent agent){
        super(agent);
    }

    public void action() {
        MessageTemplate mt = MessageTemplate.and(
                MessageTemplate.MatchLanguage(codec.getName()),
                MessageTemplate.MatchOntology(ontology.getName()));
        ACLMessage msg = myAgent.receive(mt);
        if (msg != null) {
            try {
                if(msg.getPerformative() == ACLMessage.REQUEST) {
                    ContentElement ce = myAgent.getContentManager().extractContent(msg);
                    Action act = (Action) ce;
                    if (act.getAction() instanceof Order) {
                        Order o = (Order) act.getAction();
                        System.out.println("consult"+myAgent.getName()+ " "+ o.getCustomer() + "客户的订单");
                        //将数据传到筛选分析的Agent
                        ConsultQuery query = new ConsultQuery(myAgent,o);
                        myAgent.addBehaviour(query);
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
