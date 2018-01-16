package com.service;

/**
 * Created by H77 on 2017/5/22.
 */
import vo.User;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public String test(String json) {
        JSONObject object = JSON.parseObject(json);
        Object obj = JSON.parse(json);
//        User vod = (User) obj;
        User user = JSONObject.parseObject(json,User.class);
//        User user = new User("hqq","male");
        String str = JSON.toJSONString(user);
//        User user = (User) JSONObject.parse(json);
        return str;
    }
    // This method is called if TEXT_PLAIN is request
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayPlainTextHello() {
        return "Hello Jersey";
    }
}