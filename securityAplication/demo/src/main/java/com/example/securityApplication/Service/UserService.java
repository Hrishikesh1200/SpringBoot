package com.example.securityApplication.Service;

import com.example.securityApplication.Model.UserModel;
import com.example.securityApplication.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private userRepository ur;

    public void addingUser(UserModel useradd) {
        ur.save(useradd);

    }

    public String generateToken(UserModel user2) {

        return "Token generated...";
    }
}
