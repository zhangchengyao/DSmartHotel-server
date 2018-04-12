package application.service.impl;

import application.DO.Tenant;
import application.vo.BidInfo;
import application.vo.OrderInfo;
//import dao.daoImpl.tenantDao;
//import dao.tenantMapper;
import jade.core.AID;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;
import application.multiAgent.ontology.Order;
//import org.apache.ibatis.session.SqlSession;
import application.service.common.AgentHandler;
import application.service.TenantService;
import application.util.CondVar;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by H77 on 2017/5/15.
 */
public class tenantServiceImpl implements TenantService {

    private static TenantService tenantImpl = new tenantServiceImpl();
    private tenantServiceImpl(){
    }
    public static TenantService getInstance(){return tenantImpl;}
    public boolean createTenant(Tenant user) {
//        SqlSession sqlSession = DBTools.getSession();
//        tenantMapper mapper = sqlSession.getMapper(dao.tenantMapper.class);
//        mapper.insertTenant(User);
//        sqlSession.commit();
        return true;
    }

    public Tenant findTenant(int tenantId) {
//        SqlSession sqlSession = DBTools.getSession();
//        tenantMapper mapper = sqlSession.getMapper(dao.tenantMapper.class);
//        Tenant User = mapper.selectByPrimaryKey(tenantId);
        return null;
    }
    public void createAgent(int tenantId) {
        Tenant user = this.findTenant(tenantId);
        String name = user.getName();
        AgentContainer container = AgentHandler.containers.get("main");
        Queue<BidInfo> bidQueue = new LinkedBlockingQueue<BidInfo>();
        try {
            CondVar startUpLatch = new CondVar();
            AgentController tenantAgent = container.createNewAgent(name,"application.multiAgent.agent.TenantAgent",new Object[] { startUpLatch ,user ,bidQueue});
            tenantAgent.start();
            try {
                startUpLatch.waitOn();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            AgentHandler.agents.put(name,tenantAgent);
            AgentHandler.aids.put(name,new AID(name,false));
            AgentHandler.queues.put(name,bidQueue);
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
    }
    public void closeAgent(int tenantId) {
        Tenant user = this.findTenant(tenantId);
        String name = user.getName();
        AgentController tenantAgent = AgentHandler.agents.get(name);
        try {
            tenantAgent.kill();
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
        AgentHandler.agents.remove(name);
        AgentHandler.aids.remove(name);
        AgentHandler.queues.remove(name);
    }

    public List<BidInfo> Order(OrderInfo o) {
        OrderInfo orderInfo = o;
//        Tenant User = tenantDao.getTenant(orderInfo.getUserId());
        Tenant user = new Tenant();
        String name = user.getName();

        jade.util.leap.List facilities = new  jade.util.leap.ArrayList();
        List<String> facilies = o.getFacilities();
        for(int i = 0 ; i < facilies.size() ; i++){
            facilities.add(facilies.get(i));
        }
        Order order = new Order(o.getUserId()+"",
                user.getName(),
                orderInfo.getAddress(),
                orderInfo.getHotelType(),
                orderInfo.getRoomType(),
                orderInfo.getRoomNum(),
                orderInfo.getStartTime(),
                orderInfo.getEndTime(),
                new Date(),
                orderInfo.getMinPrice(),
                orderInfo.getMaxPrice(),
                facilities,
                new AID(user.getName(),false));
        AgentController tenantAgent = AgentHandler.agents.get(name);
        List<BidInfo> bids = new ArrayList<BidInfo>();
        try {
            tenantAgent.putO2AObject(order,false);
            LinkedBlockingQueue<List<BidInfo>> queues = (LinkedBlockingQueue<List<BidInfo>>) AgentHandler.queues.get(name);
            bids = queues.take();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bids;
    }


}
