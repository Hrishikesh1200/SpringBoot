package org.example;

import java.sql.SQLOutput;

public class WiredStudent {

    String Address; //we can get this value direct because this is not private, So we don't need getter
                    // and setter to get value of address

    private int age;//But when we declare int age, String Name as private we need getter and setter
    private String Name;//because these are private variable


    public String getName() {return Name;}

    public void setName(String name) {Name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public WiredStudent(){
            System.out.println("Default Constructor");
    }


    public void build(){
         System.out.println("Spring without Spring...!");
     }

}
