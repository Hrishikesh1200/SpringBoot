package com.example.securityApplication.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class User_controller {

    @PostMapping("/add")
    public String addUser(@RequestBody String useradd){

        return "New user added Successfully...!";
    }

}
