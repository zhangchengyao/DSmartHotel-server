package service.impl;

import DO.landlord;
import DO.tenant;
import vo.LandlordInfo;
import vo.TenantInfo;
import vo.UserInfo;
import dao.daoImpl.landlordDao;
import dao.daoImpl.tenantDao;
import service.RegisterService;

/**
 * Created by zcy on 2017/6/24.
 *
 */
public class RegisterServiceImpl implements RegisterService {

    private static RegisterService registerService = new RegisterServiceImpl();

    private RegisterServiceImpl(){}

    public static RegisterService getInstance(){
        return registerService;
    }

    public String register(UserInfo userInfo,String type) {
        if(type.equals("tenant")){
            tenant tenant = new tenant(((TenantInfo)userInfo).getId(),
                    ((TenantInfo)userInfo).getName(),
                    ((TenantInfo)userInfo).getPassword(),
                    ((TenantInfo)userInfo).getGender(),
                    ((TenantInfo)userInfo).getPhonenum(),
                    ((TenantInfo)userInfo).getPreference(),
                    ((TenantInfo)userInfo).getEducation(),
                    ((TenantInfo)userInfo).getVocation(),
                    ((TenantInfo)userInfo).getEconomic());
            if(tenantDao.registerTenant(tenant)){
                return "Register Success!";
            }
        }else if(type.equals("landlord")){
            landlord landlord = new landlord(((LandlordInfo)userInfo).getLandlordid(),
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
            if(landlordDao.registerLandlord(landlord)){
                return "Register Success!";
            }
        }else{

        }

        return "Register Fail!";
    }
}
