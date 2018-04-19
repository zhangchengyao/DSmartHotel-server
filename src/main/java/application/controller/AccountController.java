package application.controller;

import application.DO.User;
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

    @PostMapping(value="/register")
    public User register(){
        return null;
    }

    @GetMapping(value="/login")
    public User login(){
        return null;
    }
}
