package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        WiredStudent ws = (WiredStudent) applicationContext.getBean("div");
        //ws.build();
      //  ws.setAge(12);
       // ws .setName("Name using getter and setter because name and age are private in WiredStudentClass");
        System.out.println( ws.getAge() );
        System.out.println( ws.getName());
        System.out.println( "Hello World!" );
        //ws.setSchool("GRV");
        System.out.println( ws.getSchool());
    }
}
