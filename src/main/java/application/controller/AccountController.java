package application.controller;

import application.service.LoginService;
import application.service.RegisterService;
import application.vo.LandlordInfo;
import application.vo.TenantInfo;
import application.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by guhan on 18/4/13.
 * 用户账号管理模块
 * 注册、登录的统一入口
 * 登陆之后可切换至host或traveller模式
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private RegisterService registerService;

    /**
     * @param name 用户名
     * @param password 密码
     * @param type 用户类型（房东还是房客）
     * @param otherInfo 存放了与房东或者房客相关的信息，以;分隔
     * @return String
     */
    @PostMapping(value="/register")
    public String register(  @RequestParam String name,
                             @RequestParam String password,
                             @RequestParam String type,
                             @RequestParam String otherInfo){
        UserInfo userInfo = null;
        if(type.equals("Tenant")){
            userInfo = new TenantInfo();
        }else if(type.equals("Landlord")){
            userInfo = new LandlordInfo();
        }
        return registerService.register(userInfo);
    }

    @GetMapping(value="/login")
    public UserInfo login(@RequestParam String name,
                          @RequestParam String password,
                          @RequestParam String type){
        return loginService.login(name, password, type);
    }
}
