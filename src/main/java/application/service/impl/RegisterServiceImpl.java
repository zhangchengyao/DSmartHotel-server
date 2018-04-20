package application.service.impl;

import application.DO.Landlord;
import application.DO.Tenant;
import application.vo.LandlordInfo;
import application.vo.TenantInfo;
import application.vo.UserInfo;
//import dao.daoImpl.landlordDao;
//import dao.daoImpl.tenantDao;
import application.service.RegisterService;
import org.springframework.stereotype.Service;

/**
 * Created by zcy on 2017/6/24.
 *
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    private static RegisterService registerService = new RegisterServiceImpl();

    private RegisterServiceImpl(){}

    public static RegisterService getInstance(){
        return registerService;
    }

    public String register(UserInfo userInfo,String type) {
        if(type.equals("Tenant")){
            Tenant tenant = new Tenant(((TenantInfo)userInfo).getId(),
                    ((TenantInfo)userInfo).getName(),
                    ((TenantInfo)userInfo).getPassword(),
                    ((TenantInfo)userInfo).getGender(),
                    ((TenantInfo)userInfo).getPhonenum(),
                    ((TenantInfo)userInfo).getPreference(),
                    ((TenantInfo)userInfo).getEducation(),
                    ((TenantInfo)userInfo).getVocation(),
                    ((TenantInfo)userInfo).getEconomic());
//            if(tenantDao.registerTenant(Tenant)){
//                return "Register Success!";
//            }
        }else if(type.equals("Landlord")){
            Landlord landlord = new Landlord(((LandlordInfo)userInfo).getLandlordid(),
                    ((LandlordInfo)userInfo).getLandlordname(),
                    ((LandlordInfo)userInfo).getPassword(),
                    ((LandlordInfo)userInfo).getLandlordtype(),
                    ((LandlordInfo)userInfo).getFeature(),
                    ((LandlordInfo)userInfo).getStartprice(),
                    ((LandlordInfo)userInfo).getCity(),
                    ((LandlordInfo)userInfo).getArea(),
                    ((LandlordInfo)userInfo).getDetailaddress(),
                    ((LandlordInfo)userInfo).getComment(),
                    ((LandlordInfo)userInfo).getLongitude(),
                    ((LandlordInfo)userInfo).getLatitude(),
                    ((LandlordInfo)userInfo).getConcat(),
                    ((LandlordInfo)userInfo).getIntroduction(),
                    ((LandlordInfo)userInfo).getCharacteristic());
//            if(landlordDao.registerLandlord(Landlord)){
//                return "Register Success!";
//            }
        }else{

        }

        return "Register Fail!";
    }
}
