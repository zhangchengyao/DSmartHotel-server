package service;
import jade.core.*;
import jade.core.Runtime;
import jade.wrapper.*;
import jade.wrapper.AgentContainer;
import multiAgent.ontology.Order;
import util.CondVar;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by H77 on 2017/5/13.
 */
public class AgentApi {
    //保存相应的container
    private Map<String,AgentContainer> containers = new HashMap<String, AgentContainer>();
    //保存相应的agent
    private Map<String,AgentController> agents= new HashMap<String,AgentController>();
    //外界动态生成Agent
    public void init(){
        Runtime rt = Runtime.instance();
        rt.setCloseVM(true);
        Profile pMain = new ProfileImpl("127.0.0.1",1099,null);
        AgentContainer container = rt.createMainContainer(pMain);
        containers.put("main",container);
        System.out.println("启动agents");
        try {
            AgentController consultAgent = container.createNewAgent("f1","multiAgent.agent.ConsultAgent",null);
            consultAgent.start();
            agents.put(consultAgent.getName(),consultAgent);
            AgentController selectAgent = container.createNewAgent("f3","multiAgent.agent.SelectAgent",null);
            selectAgent.start();
            agents.put(selectAgent.getName(),selectAgent);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
    }
    public void createAgent(String name, String clazz){
        AgentContainer container = containers.get("main");
        try {
            CondVar startUpLatch = new CondVar();
            AgentController tenantAgent = container.createNewAgent(name,clazz,new Object[] { startUpLatch });
            tenantAgent.start();
            try {
                startUpLatch.waitOn();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            agents.put(name,tenantAgent);
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
    }
    public void putOrder(){
        AgentController tenantAgent = agents.get("f2");
        Date dStart = new Date(2017,5,9);
        Date dEnd = new Date(2017,5,12);
        Date dCreate = new Date(2017,5,3);
        Order order = new Order("1",
                "小明",
                "南京市南大",
                "Theme Hotel",
                "豪华套件",
                1,
                dStart,
                dEnd,
                dCreate,
                120,
                200,
                null,
                new AID("f2",false));
        try {
            tenantAgent.putO2AObject(order,false);
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        AgentApi agent = new AgentApi();
        agent.init();
        agent.createAgent("f2","multiAgent.agent.TenantAgent");
        agent.putOrder();
    }


}
