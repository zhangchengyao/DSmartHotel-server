package application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
