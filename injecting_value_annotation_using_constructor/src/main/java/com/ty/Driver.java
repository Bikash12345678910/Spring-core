package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[]args){
        ConfigurableApplicationContext c=new ClassPathXmlApplicationContext("configuration.xml");
        Trainer_of_pw t =(Trainer_of_pw)c.getBean(Trainer_of_pw.class);
        System.out.println(t.id);
        System.out.println(t.name);
    }
}
