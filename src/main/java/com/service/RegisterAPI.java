package com.service;

import vo.LandlordInfo;
import vo.TenantInfo;
import com.alibaba.fastjson.JSONObject;
import service.RegisterService;
import service.impl.RegisterServiceImpl;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by zcy on 2017/6/22.
 *
 */
@Path("/register")
public class RegisterAPI {
    @Path("/tenant")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public String tenantRegister(String json){
        TenantInfo tenantInfo = JSONObject.parseObject(json,TenantInfo.class);
        RegisterService registerService = RegisterServiceImpl.getInstance();
        return registerService.register(tenantInfo,"tenant");
    }

    @Path("/landlord")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public String landlordRegister(String json){
        LandlordInfo landlordInfo = JSONObject.parseObject(json,LandlordInfo.class);
        RegisterService registerService = RegisterServiceImpl.getInstance();
        return registerService.register(landlordInfo,"landlord");
    }
}
