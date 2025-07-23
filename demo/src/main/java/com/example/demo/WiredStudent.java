package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WiredStudent {
    @Autowired // 1) field injection(we need to use keyword Autowired):  here we referenced student class without creating object
    private student Student;
    // 2) constructor (we don't need to use keyword Autowired) : if we don't want to use Autowired then we can create constructor here
//    public WiredStudent(student Student) {
//        this.Student = Student;
//    }
    // 3) SetterMethod (we need to use keyword Autowired)
    public void setStudent(student Student) {
        this.Student = Student;
    }

    public void build(){
         Student.lang();
         System.out.println("Autowired Done...!");
     }


}
