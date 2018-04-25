package application;

import application.service.ManagerService;
import application.service.impl.ManagerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DSmartHotelServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DSmartHotelServerApplication.class, args);
        ManagerService managerService = ManagerServiceImpl.getInstance();
        managerService.initSystem();
    }
}
