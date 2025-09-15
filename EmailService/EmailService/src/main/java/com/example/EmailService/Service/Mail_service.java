package com.example.EmailService.Service;

import com.example.EmailService.Model.Mail_data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mail_service {

    @Autowired
    private Mail_data md;
    public String send_Service(Mail_service ms1){


        return "Mail send Successfully";
    }

}
