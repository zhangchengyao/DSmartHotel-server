package application.service.impl;

import application.DO.Landlord;
import application.DO.Tenant;
import application.DO.User;
import application.vo.LandlordInfo;
import application.vo.TenantInfo;
import application.vo.UserInfo;
//import dao.daoImpl.UserDao;
import application.service.LoginService;


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
//        User u = UserDao.findUser(name,pwd,type);
        User u = new Landlord();
        if(u instanceof Landlord){
            return new LandlordInfo(((Landlord) u).getLandlordid(),
                    ((Landlord) u).getLandlordname(),
                    u.getPassword(),
                    ((Landlord) u).getLandlordtype(),
                    ((Landlord) u).getFeature(),
                    ((Landlord) u).getStartprice(),
                    ((Landlord) u).getCity(),
                    ((Landlord) u).getArea(),
                    ((Landlord) u).getDetailaddress(),
                    ((Landlord) u).getComment(),
                    ((Landlord) u).getLongitude(),
                    ((Landlord) u).getLatitude(),
                    ((Landlord) u).getConcat(),
                    ((Landlord) u).getIntroduction(),
                    ((Landlord) u).getCharacteristic());
        }else if(u instanceof Tenant){
            return new TenantInfo(u.getId(),
                    u.getName(),
                    u.getPassword(),
                    ((Tenant) u).getGender(),
                    ((Tenant) u).getPhonenum(),
                    ((Tenant) u).getPreference(),
                    ((Tenant) u).getEducation(),
                    ((Tenant) u).getVocation(),
                    ((Tenant) u).getEconomic());
        }else{
            return null;
        }
    }
}
