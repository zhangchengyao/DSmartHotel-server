package application.multiAgent.behavior.listener;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import application.multiAgent.agent.TenantAgent;
import application.multiAgent.behavior.message.TenantRequest;
import application.multiAgent.ontology.Order;

/**
 * Created by H77 on 2017/5/13.
 */
public class TenantApiListener extends CyclicBehaviour {

    TenantAgent agent = null;
    public TenantApiListener(Agent agent){
        super(agent);
        this.agent = (TenantAgent) agent;
    }
    public void action() {
        Object obj = agent.getO2AObject();
        if(obj != null) {
            if (obj instanceof Order) {
                Order o = (Order) obj;
                agent.addBehaviour(new TenantRequest(agent, o));
                agent.setOrder(agent.getOwner().getId(),o);
            }
        }else{
            block();
        }
    }
}
