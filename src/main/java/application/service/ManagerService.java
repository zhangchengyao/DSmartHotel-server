package application.service;

import application.contracts.BidSystemFactory_sol_BidSystemFactory;

/**
 * Created by H77 on 2017/5/15.
 */
public interface ManagerService {
    public void initSystem();
    public BidSystemFactory_sol_BidSystemFactory getContractFactory();
}
