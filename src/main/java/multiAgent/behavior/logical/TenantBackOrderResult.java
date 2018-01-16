package multiAgent.behavior.logical;

import jade.core.behaviours.OneShotBehaviour;
import multiAgent.ontology.Bid;
import multiAgent.ontology.Order;
import multiAgent.ontology.Room;
import multiAgent.ontology.RoomType;
import service.common.AgentHandler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by H77 on 2017/5/15.
 */
public class TenantBackOrderResult extends OneShotBehaviour {

    private Order order = null;
    private List<Bid> bids = null;

    public TenantBackOrderResult(Order order , List<Bid> bids){
        this.order = order;
        this.bids = bids;
    }
    public void action() {
        //这部分代码是将agent的处理结果返回给外部程序。
        Bid bid = new Bid();
        bid.setRoom(new Room(1,1, RoomType.Business+"",null,200,new Date(2017,5,2),new Date(2017,5,9),"200",2));
        bid.setPrice(120);
        List<Bid> bids = new ArrayList<Bid>();
        bids.add(bid);
        AgentHandler.results.put("1",bids);
    }
}
