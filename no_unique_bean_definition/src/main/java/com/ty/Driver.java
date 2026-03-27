package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[]args){
        ConfigurableApplicationContext c=new AnnotationConfigApplicationContext(configuration.class);
        Person p=(Person)c.getBean(Person.class);
        p.use();
    }
}
