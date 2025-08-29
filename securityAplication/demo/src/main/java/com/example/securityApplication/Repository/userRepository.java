package com.example.securityApplication.Repository;

import com.example.securityApplication.Service.UserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<UserService, Integer> {

}
