package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        WiredStudent ws = applicationContext.getBean(WiredStudent.class);
        ws.build();
        System.out.println( "Hello World!" );
    }
}
