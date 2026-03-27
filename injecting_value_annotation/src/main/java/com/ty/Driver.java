package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[]args){
        ConfigurableApplicationContext c=new ClassPathXmlApplicationContext("configuration.xml");
        Student b =(Student)c.getBean(Student.class);
        System.out.println(b.id);
        System.out.println(b.name);
        System.out.println(b.age);
    }
}
