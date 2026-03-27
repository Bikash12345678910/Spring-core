package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext c = new ClassPathXmlApplicationContext("configuration.xml");
        Person p =(Person)c.getBean(Person.class);
        System.out.println(p.getAge());
    }
}
