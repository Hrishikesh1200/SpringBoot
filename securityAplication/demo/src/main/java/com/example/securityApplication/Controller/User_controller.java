package com.example.securityApplication.Controller;


import com.example.securityApplication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class User_controller {

    @Autowired

    private UserService us;

    @PostMapping("/add")
    public String addUser(@RequestBody String useradd){

        us.addingUser(useradd);
        return "New user added Successfully...!";
    }

}
