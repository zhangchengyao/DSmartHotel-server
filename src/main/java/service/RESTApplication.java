package service;

import org.glassfish.jersey.server.ResourceConfig;
import service.impl.managerServiceImpl;

/**
 * Created by H77 on 2017/5/15.
 */
public class RESTApplication extends ResourceConfig{

    public RESTApplication(){
        ManagerService manager = managerServiceImpl.getInstance();
        manager.initSystem();
    }

//    public static void main(String[] args){
//         TenantService tenant = tenantServiceImpl.getInstance();
//        user user = new user("h77","123456","male","student",18);
//         tenant.createTenant(user);
//         ManagerService manager = managerServiceImpl.getInstance();
//         manager.initSystem();
//         tenant user = tenant.findTenant(1);
//         Date dStart = new Date(2017,5,28);
//         Date dEnd = new Date(2017,5,29);
//         List<String> facility = new ArrayList<String>();
//         facility.add("wifi");
//         facility.add("park");
//         OrderInfo order = new OrderInfo(1,
//                 "南京市南大",
//                 "Theme",
//                 "Business",
//                 1,
//                 100,
//                 900,
//                 facility,
//                 dStart,
//                 dEnd);
//         tenant.createAgent(user.getId());
//         tenant.Order(user.getName(),order);
//    }
}
