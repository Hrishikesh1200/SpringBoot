package com.example.EmailService.Controller;

import com.example.EmailService.Service.Mail_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class Home_controller {

    @Autowired
    private Mail_service ms;

    @PostMapping("/sending")
    public String send_Service(@RequestBody Mail_service ms1){

    ms.send_Service(ms1);
        return "Sent Successfully..";
    }





}
