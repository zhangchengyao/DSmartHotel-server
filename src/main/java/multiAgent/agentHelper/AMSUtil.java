package multiAgent.agentHelper;

import jade.core.AID;
import jade.core.Agent;
import jade.domain.AMSService;
import jade.domain.FIPAAgentManagement.AMSAgentDescription;
import jade.domain.FIPAAgentManagement.SearchConstraints;

import java.util.ArrayList;

/**
 * Created by H77 on 2017/5/6.
 */
public class AMSUtil {

    public static ArrayList<AID> getAllAgent(Agent a){
        AMSAgentDescription[] agents = null;
        try {
            SearchConstraints c = new SearchConstraints();
            c.setMaxResults (new Long(-1));
            agents = AMSService.search( a, new AMSAgentDescription (), c );
        } catch (Exception e) {
            System.out.println( "Problem in searching Agents in AMS: " + e );
            e.printStackTrace();
        }

        ArrayList<AID> idlist=new ArrayList<AID>();
        AID myID = a.getAID();
        for (int i=0; i<agents.length;i++)
        {
            AID agentID = agents[i].getName();
            if((!agentID.equals(myID))&&(!agentID.getLocalName().equals("rma"))
                    &&(!agentID.getLocalName().equals("ams"))&&(!agentID.getLocalName().equals("df"))){
                idlist.add(agentID);
            }
        }
        return idlist;
    }
}
