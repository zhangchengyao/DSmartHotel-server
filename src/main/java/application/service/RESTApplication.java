package application.service;

import org.glassfish.jersey.server.ResourceConfig;
import application.service.impl.managerServiceImpl;

/**
 * Created by H77 on 2017/5/15.
 */
public class RESTApplication extends ResourceConfig{

    public RESTApplication(){
        ManagerService manager = managerServiceImpl.getInstance();
        manager.initSystem();
    }

//    public static void main(String[] args){
//         TenantService Tenant = tenantServiceImpl.getInstance();
//        User User = new User("h77","123456","male","student",18);
//         Tenant.createTenant(User);
//         ManagerService manager = managerServiceImpl.getInstance();
//         manager.initSystem();
//         Tenant User = Tenant.findTenant(1);
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
//         Tenant.createAgent(User.getId());
//         Tenant.Order(User.getName(),order);
//    }
}
