package com.service;

import vo.User;
import vo.UserInfo;
import com.alibaba.fastjson.JSONObject;
import service.LoginService;
import service.impl.LoginServiceImpl;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by zcy on 2017/6/4.
 * 用户登录
 */

@Path("/login")
public class LoginApi {
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public String login(String json){
        User user = JSONObject.parseObject(json,User.class);
        String name = user.getName();
        String password = user.getPassword();
        String type = user.getType();
        LoginService loginService = LoginServiceImpl.getInstance();
        UserInfo userInfo = loginService.login(name,password,type);
        return JSONObject.toJSONString(userInfo);
    }
}
