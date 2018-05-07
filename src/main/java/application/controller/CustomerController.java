package application.controller;

import application.DO.Room;
import application.contracts.Room_sol_Room;
import application.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 管理房客的操作
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    TenantService tenantService;

    @GetMapping(value="/home")
    public List<Room_sol_Room> getRecommendedRooms(int id){
        return tenantService.getRecommendedRooms(id);
    }
}
