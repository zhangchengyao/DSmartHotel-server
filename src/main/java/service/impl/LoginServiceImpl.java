package service.impl;

import DO.landlord;
import DO.tenant;
import DO.user;
import vo.LandlordInfo;
import vo.TenantInfo;
import vo.UserInfo;
import dao.daoImpl.UserDao;
import service.LoginService;


/**
 * Created by zcy on 2017/6/4.
 *
 */
public class LoginServiceImpl implements LoginService{

    private static LoginService login = new LoginServiceImpl();

    private LoginServiceImpl(){}

    public static LoginService getInstance(){
        return login;
    }

    public UserInfo login(String name, String pwd, String type) {
        user u = UserDao.findUser(name,pwd,type);
        if(u instanceof landlord){
            return new LandlordInfo(((landlord) u).getLandlordid(),
                    ((landlord) u).getLandlordname(),
                    u.getPassword(),
                    ((landlord) u).getLandlordtype(),
                    ((landlord) u).getFeature(),
                    ((landlord) u).getStartprice(),
                    ((landlord) u).getCity(),
                    ((landlord) u).getArea(),
                    ((landlord) u).getDetailaddress(),
                    ((landlord) u).getComment(),
                    ((landlord) u).getLongitude(),
                    ((landlord) u).getLatitude(),
                    ((landlord) u).getConcat(),
                    ((landlord) u).getIntroduction(),
                    ((landlord) u).getCharacteristic());
        }else if(u instanceof tenant){
            return new TenantInfo(u.getId(),
                    u.getName(),
                    u.getPassword(),
                    ((tenant) u).getGender(),
                    ((tenant) u).getPhonenum(),
                    ((tenant) u).getPreference(),
                    ((tenant) u).getEducation(),
                    ((tenant) u).getVocation(),
                    ((tenant) u).getEconomic());
        }else{
            return null;
        }
    }
}
