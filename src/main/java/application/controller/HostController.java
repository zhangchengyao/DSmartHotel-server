package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by guhan on 18/4/13.
 */
@Controller
@RequestMapping("/host")
public class HostController {

    @GetMapping(value="/houselist")
    @ResponseBody
    public String getHouseList(){
        return "house list json";
    }
}
