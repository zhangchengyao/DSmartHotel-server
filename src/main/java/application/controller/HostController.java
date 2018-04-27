package application.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by guhan on 18/4/13.
 */
@RestController
@RequestMapping("/host")
public class HostController {

    @GetMapping(value="/houselist")
    @ResponseBody
    public String getHouseList(){
        return "house list json";
    }

    @PostMapping(value="/cancel")
    @ResponseBody
    public boolean cancelOrder(){
        return false;
    }
}
