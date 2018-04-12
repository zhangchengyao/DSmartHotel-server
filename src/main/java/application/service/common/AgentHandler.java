package application.service.common;

import jade.core.AID;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import application.multiAgent.ontology.Bid;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Created by H77 on 2017/5/15.
 */
public class AgentHandler {
    //保存相应的container
    public static final Map<String,AgentContainer> containers = new ConcurrentHashMap<String, AgentContainer>();
    //保存相应的agent
    public static final Map<String,AgentController> agents= new ConcurrentHashMap<String,AgentController>();
    //保存相应的queue
    public static final Map<String,Queue> queues = new ConcurrentHashMap<String, Queue>();
    //保存agent对应的AID
    public static final Map<String,AID> aids= new ConcurrentHashMap<String,AID>();
    //保存对应order的result
    public static final Map<String,List<Bid>> results= new ConcurrentHashMap<String,List<Bid>>();
    //保存经过只能还价之后返回的具体房源信息
    public static final Map<Integer,Bid> finalBid = new ConcurrentHashMap<Integer, Bid>();

}
