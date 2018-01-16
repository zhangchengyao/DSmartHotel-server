package com.service;

import DO.room;
import vo.RoomInfo;
import com.alibaba.fastjson.JSONObject;
import service.impl.landlordServiceImpl;
import service.LandlordService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by zcy on 2017/6/30.
 *
 */
@Path("/landlord")
public class LandlordApi {
    @Path("/query")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public String queryRoom(String json){
        RoomInfo roomInfo = JSONObject.parseObject(json,RoomInfo.class);
        LandlordService landlordService = landlordServiceImpl.getInstance();
        landlordService.findRoom(roomInfo.getId());
        return null;
    }

    @Path("/register")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public String registerRoom(String json){
        RoomInfo roomInfo = JSONObject.parseObject(json,RoomInfo.class);
        LandlordService landlordService = landlordServiceImpl.getInstance();
        room room = new room();
        return landlordService.creatRoom(room)+"";
    }
}
