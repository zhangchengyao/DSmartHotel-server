package com.service;

import vo.BidInfo;
import vo.OrderInfo;
import com.alibaba.fastjson.JSONObject;
import service.impl.tenantServiceImpl;
import service.TenantService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by H77 on 2017/5/29.
 */
@Path("/tenant")
public class TenantApi {
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public String order(String json){
        OrderInfo  order = JSONObject.parseObject(json, OrderInfo.class);
        TenantService tenantService = tenantServiceImpl.getInstance();
//        Date dStart = new Date(2017,5,28);
//        Date dEnd = new Date(2017,5,29);
//        List<String> facility = new ArrayList<String>();
//        facility.add("wifi");
//        facility.add("park");
//        OrderInfo order1 = new OrderInfo(1,
//                "南京市南大",
//                "Theme",
//                "Business",
//                1,
//                100,
//                900,
//                facility,
//                dStart,
//                dEnd);
        tenantService.createAgent(order.getUserId());
        //目前bid还没返回
//        OrderInfo orderInfo = new OrderInfo(order.getUserId(),
//                                            order.getAddress(),
//                                            order.getHotelType(),
//                                            order.getRoomType(),
//                                            order.getRoomNum(),
//                                            order.getMinPrice(),
//                                            order.getMaxPrice(),
//                                            order.getFacilities(),
//                                            order.getStartTime(),
//                                            order.getEndTime());
        List<BidInfo> bids = tenantService.Order(order);
//        String result = JSONObject.toJSONString(bid);
        return JSONObject.toJSONString(bids);
    }

}
