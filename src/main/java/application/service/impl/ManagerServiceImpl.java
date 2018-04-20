package application.service.impl;

import application.contracts.BidSystemFactory_sol_BidSystemFactory;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;
import application.service.common.AgentHandler;
import application.service.ManagerService;
import org.springframework.stereotype.Service;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;
import java.math.BigInteger;

import static org.web3j.tx.Contract.GAS_LIMIT;

/**
 * Created by H77 on 2017/5/15.
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    private static ManagerService manager = new ManagerServiceImpl();
    private ManagerServiceImpl(){
        createContractFactory();
    };
    public static ManagerService getInstance(){return manager;}

    private BidSystemFactory_sol_BidSystemFactory contractFactory;

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

    private void createContractFactory() {
        // 创建bidSystemFactory来管理区块链存储
        Web3j web3j = Web3j.build(new HttpService());
        Credentials credentials = null;
        BigInteger GAS_PRICE = new BigInteger("20");
        try{
            credentials = WalletUtils.loadCredentials("password", "/path/to/walletfile");
            contractFactory = BidSystemFactory_sol_BidSystemFactory.load(
                    "address", web3j, credentials, GAS_PRICE, GAS_LIMIT);
        }catch (CipherException | IOException e) {
            e.printStackTrace();
        }catch(Exception e){
            try {
                contractFactory = BidSystemFactory_sol_BidSystemFactory.deploy(
                        web3j, credentials, GAS_PRICE, GAS_LIMIT).send();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    public BidSystemFactory_sol_BidSystemFactory getContractFactory(){
        return contractFactory;
    }
}
