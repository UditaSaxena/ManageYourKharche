package in.us.manageExpenses.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/status", "/health"})

public class HomeController {
    // when we will deploy the application to render then to test whether the app is running or not for that creating this public endpoint so that anybody can make a request to this api endpoint and if we get the returned message then everything is working fine.
    @GetMapping
    public String healthCheck(){
        return "Application is running";
    }


}