package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhouchang on 18/4/13.
 */
@Controller
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping(value="/transfer2Agency")
    public boolean transfer2Agency() {
        return false;
    }

    @GetMapping(value="/transfer2Landlord")
    public boolean transfer2Landlord(){
        return false;
    }

    @GetMapping(value="/transfer2Agency")
    public boolean refund() {
        return false;
    }
}
