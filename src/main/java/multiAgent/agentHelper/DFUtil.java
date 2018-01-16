package multiAgent.agentHelper;

import jade.core.*;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.*;
import jade.domain.FIPAException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H77 on 2017/5/6.
 */
public class DFUtil {
       /*
         向DFagent 询问了注册了Order服务的Agent 最后是通过 DFService.search查找相应的Agent
        */
    public static DFAgentDescription[] searchServiceAgents(Agent agent, String serviceName){
        DFAgentDescription serviceSearch = new DFAgentDescription();
        ServiceDescription sd = new ServiceDescription();
        sd.setType(serviceName);
        serviceSearch.addServices(sd);
        DFAgentDescription[] result = null;
        try {
             result = DFService.search(agent,serviceSearch);
        } catch (FIPAException e) {
            System.out.println( "Problem in searching service in DFS: " + e );
            e.printStackTrace();
        }
        return result;
    }
    public static List<AID> searchServiceAIDs(Agent agent, String serviceName){
        DFAgentDescription[] dfas = searchServiceAgents(agent,serviceName);
        List<AID> aids = new ArrayList<AID>();
        if(dfas == null) return aids;
        for(DFAgentDescription dfa : dfas){
              aids.add(dfa.getName());
        }
        return aids;
    }
    //随机选择注册该服务的一个Agent进行交流
    public static AID searchServiceAgent(Agent agent ,String serviceName){
        DFAgentDescription[] dfas = searchServiceAgents(agent,serviceName);
        AID aid = null;
        if(dfas != null){
            int num = dfas.length;
            int select = (int)(Math.random()*num);
            aid = dfas[select].getName();
        }
        return aid;
    }
    public static void registerService(Agent agent , String serviceName){
        DFAgentDescription dfd = new DFAgentDescription();
        dfd.setName(agent.getAID());
        ServiceDescription sd = new ServiceDescription();
        sd.setType(serviceName);
        sd.setName(agent.getLocalName()+serviceName);
        dfd.addServices(sd);
        try {
            DFService.register(agent,dfd);
        } catch (FIPAException e) {
            e.printStackTrace();
        }
    }

}
