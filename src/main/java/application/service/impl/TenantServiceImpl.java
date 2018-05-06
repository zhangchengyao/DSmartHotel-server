package application.service.impl;

import application.DO.Room;
import application.DO.Tenant;
import application.contracts.BidSystemFactory_sol_BidSystemFactory;
import application.contracts.Landlord_sol_Landlord;
import application.contracts.Room_sol_Room;
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
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

import static org.web3j.tx.Contract.GAS_LIMIT;

/**
 * Created by H77 on 2017/5/15.
 */
@Service
public class TenantServiceImpl implements TenantService {

    private static TenantService tenantImpl = new TenantServiceImpl();
    private TenantServiceImpl(){
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

    @Override
    public List<Room> getRecommendedRooms(int tenantId) {
        String exe = "python";
        String command = "../../util/predict.py";
        String num1 = tenantId+"";
        BidSystemFactory_sol_BidSystemFactory bidSystemFactory_sol_bidSystemFactory = ManagerServiceImpl.getInstance().getContractFactory();
        BigInteger num_landlords;
        List<Room_sol_Room> rooms = new ArrayList<>();
        Web3j web3j = Web3j.build(new HttpService());
        Credentials credentials;
        BigInteger GAS_PRICE = new BigInteger("20");
        try {
            credentials = WalletUtils.loadCredentials("password", "/path/to/walletfile");
            num_landlords = bidSystemFactory_sol_bidSystemFactory.getNumOfLandlord().send();
            for(int i=0;i<num_landlords.intValue();i++){
                String address = bidSystemFactory_sol_bidSystemFactory.getLandlord(new BigInteger(i+"")).send();
                Landlord_sol_Landlord landlord= Landlord_sol_Landlord.load(address,web3j, credentials, GAS_PRICE, GAS_LIMIT);
                List<String> roomAddresses = landlord.getAllRooms().send();
                for(String ra: roomAddresses){
                    rooms.add(Room_sol_Room.load(ra, web3j, credentials, GAS_PRICE, GAS_LIMIT));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Room_sol_Room room: rooms){
            stringBuilder.append(room.getRoomId()).append(" ");
        }

        String[] cmdArr = new String[] {exe, command, num1, stringBuilder.toString()};
        Process process;
        String str = null;
        try {
            process = Runtime.getRuntime().exec(cmdArr);
            InputStream is = process.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            str = dis.readLine();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(str);
        return null;
    }


}
