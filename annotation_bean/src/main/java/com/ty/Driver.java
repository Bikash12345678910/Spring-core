package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[]args){
        ConfigurableApplicationContext c=new AnnotationConfigApplicationContext(config.class);
        Student s=(Student)c.getBean(Student.class);
        s.timewaste();
    }
}
