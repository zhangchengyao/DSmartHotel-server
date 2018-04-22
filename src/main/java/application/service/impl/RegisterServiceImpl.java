package application.service.impl;

import application.DO.Landlord;
import application.DO.Tenant;
import application.contracts.BidSystemFactory_sol_BidSystemFactory;
import application.service.ManagerService;
import application.vo.LandlordInfo;
import application.vo.TenantInfo;
import application.vo.UserInfo;
//import dao.daoImpl.landlordDao;
//import dao.daoImpl.tenantDao;
import application.service.RegisterService;
import org.springframework.stereotype.Service;
import org.web3j.protocol.core.RemoteCall;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by zcy on 2017/6/24.
 *
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    public String register(UserInfo userInfo) {
        ManagerService managerService = ManagerServiceImpl.getInstance();
        BidSystemFactory_sol_BidSystemFactory factory = managerService.getContractFactory();
        if(userInfo instanceof TenantInfo){
            BigInteger num;
            try {
                num = factory.getNumOfTenant().send();
                factory.createTenant(   num.add(new BigInteger("1")),
                                        userInfo.getName(),
                                        userInfo.getPassword(),
                                        new ArrayList<>());
            } catch (Exception e) {
                e.printStackTrace();
            }
            //todo create tenant in blockchain
//            Tenant tenant = new Tenant(((TenantInfo)userInfo).getId(),
//                    ((TenantInfo)userInfo).getName(),
//                    ((TenantInfo)userInfo).getPassword(),
//                    ((TenantInfo)userInfo).getGender(),
//                    ((TenantInfo)userInfo).getPhonenum(),
//                    ((TenantInfo)userInfo).getPreference(),
//                    ((TenantInfo)userInfo).getEducation(),
//                    ((TenantInfo)userInfo).getVocation(),
//                    ((TenantInfo)userInfo).getEconomic());
//            if(tenantDao.registerTenant(Tenant)){
//                return "Register Success!";
//            }


        }else if(userInfo instanceof LandlordInfo){
            BigInteger num;
            try {
                num = factory.getNumOfLandlord().send();
                factory.createLandlord( num.add(new BigInteger("1")),
                                        userInfo.getName(),
                                        userInfo.getPassword(),
                                        new ArrayList<>());
            } catch (Exception e) {
                e.printStackTrace();
            }
//            Landlord landlord = new Landlord(((LandlordInfo)userInfo).getId(),
//                    ((LandlordInfo)userInfo).getName(),
//                    ((LandlordInfo)userInfo).getPassword(),
//                    ((LandlordInfo)userInfo).getLandlordtype(),
//                    ((LandlordInfo)userInfo).getFeature(),
//                    ((LandlordInfo)userInfo).getStartprice(),
//                    ((LandlordInfo)userInfo).getCity(),
//                    ((LandlordInfo)userInfo).getArea(),
//                    ((LandlordInfo)userInfo).getDetailaddress(),
//                    ((LandlordInfo)userInfo).getComment(),
//                    ((LandlordInfo)userInfo).getLongitude(),
//                    ((LandlordInfo)userInfo).getLatitude(),
//                    ((LandlordInfo)userInfo).getConcat(),
//                    ((LandlordInfo)userInfo).getIntroduction(),
//                    ((LandlordInfo)userInfo).getCharacteristic());
//            if(landlordDao.registerLandlord(Landlord)){
//                return "Register Success!";
//            }
        }
        return "Register Fail!";
    }
}
