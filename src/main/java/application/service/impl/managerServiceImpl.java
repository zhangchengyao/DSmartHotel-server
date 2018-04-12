package application.service.impl;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;
import application.service.common.AgentHandler;
import application.service.ManagerService;

/**
 * Created by H77 on 2017/5/15.
 */
public class managerServiceImpl implements ManagerService {

    private static ManagerService manager = new managerServiceImpl();
    private managerServiceImpl(){};
    public static ManagerService getInstance(){return manager;}
    public void initSystem() {
        Runtime rt = Runtime.instance();
        rt.setCloseVM(true);
        Profile pMain = new ProfileImpl("127.0.0.1",1100,null);
        AgentContainer container = rt.createMainContainer(pMain);
        AgentHandler.containers.put("main",container);
        System.out.println("系统初始化");
        System.out.println("---------------------");
        System.out.println("初始化ManagerAgent");
        try {
            AgentController consultAgent = container.createNewAgent("f1","application.multiAgent.agent.ConsultAgent",null);
            consultAgent.start();
            AgentHandler.agents.put(consultAgent.getName(),consultAgent);
            AgentController selectAgent = container.createNewAgent("f3","application.multiAgent.agent.SelectAgent",null);
            selectAgent.start();
            AgentHandler.agents.put(selectAgent.getName(),selectAgent);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
    }
}
