package application.controller;

import application.service.LoginService;
import application.service.RegisterService;
import application.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping(value="/register")
    public UserInfo register(){
        return null;
    }

    @GetMapping(value="/login")
    public UserInfo login(String id, String password, String type){
        return loginService.login(id, password, type);
    }
}
