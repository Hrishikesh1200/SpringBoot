package org.example;

import java.sql.SQLOutput;

public class WiredStudent {

    String Address; //1)we can get this value direct because this is not private, So we don't need getter
                    // and setter to get value of address

    private int age;//2)But when we declare int age, String Name as private we need getter and setter
    private String Name;//because these are private variable

    //3)we can also add property in spring.xml file to get value of name and age like below
    //<property name="age" value="1666"/>
    //<property name="Name" value="Assigned value by Spring"/>
    //this will get value from spring file

    private String school;

    public String getSchool() {return school;}

    public void setSchool(String school) {this.school = school;}
//Parameterized constructor - for getting value of School from spring.xml file
    //using Constructor-arg
    public WiredStudent(String school) {
        this.school = school;
    }

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
