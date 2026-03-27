package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[]args){
        ConfigurableApplicationContext c=new ClassPathXmlApplicationContext("configuration.xml");
        Student s=(Student) c.getBean("mystudent");
        System.out.println(s.getId());
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}
