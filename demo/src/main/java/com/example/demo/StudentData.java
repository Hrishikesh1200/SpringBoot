package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class StudentData {

    public StudentData (){}

    public StudentData(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    int id;
    String name;
    String email;

    @Override
    public String toString() {
        return "StudentData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
