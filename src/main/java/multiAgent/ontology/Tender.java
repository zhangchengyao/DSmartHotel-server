package multiAgent.ontology;

import jade.content.AgentAction;
import jade.core.AID;
import jade.util.leap.List;

import java.util.Date;

/**
 * Created by H77 on 2017/5/6.
 *
 */
public class Tender implements AgentAction {
    //招标书中暂时只包含Order
    private Order order;
    public Tender(Order order) {
        this.order = order;
    }
    public Tender(){

    }
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


}
