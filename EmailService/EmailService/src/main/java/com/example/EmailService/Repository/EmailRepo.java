package com.example.EmailService.Repository;

import com.example.EmailService.Model.Mail_data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmailRepo extends JpaRepository<Mail_data, Integer>{
}
