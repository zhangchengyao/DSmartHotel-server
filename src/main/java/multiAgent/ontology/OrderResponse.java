package multiAgent.ontology;

import jade.content.AgentAction;
import jade.core.AID;
import jade.util.leap.List;

/**
 * Created by H77 on 2017/5/7.
 */
public class OrderResponse implements AgentAction {

    private String orderId;
    private int responseNum;
    private AID source;
    private List bids;

    public OrderResponse(String orderId, int responseNum, AID source, List bids) {
        this.orderId = orderId;
        this.responseNum = responseNum;
        this.source = source;
        this.bids = bids;
    }
    public OrderResponse(){
    }
    public int getResponseNum() {
        return responseNum;
    }
    public void setResponseNum(int responseNum) {
        this.responseNum = responseNum;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public List getBids() {
        return bids;
    }
    public void setBids(List bids) {
        this.bids = bids;
    }
    public void addBid(Bid bid){
       bids.add(bid);
    }
    public AID getSource() {
        return source;
    }
    public void setSource(AID source) {
        this.source = source;
    }

}
