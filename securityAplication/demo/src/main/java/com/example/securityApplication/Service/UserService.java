package com.example.securityApplication.Service;

import com.example.securityApplication.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    userRepository ur;
    public void addingUser(User useradd) {
        ur.save(useradd);
    }
}
