package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Driver {
    public static void main(String[]args){
        ConfigurableApplicationContext c=new ClassPathXmlApplicationContext("configuration.xml");
        Student s=(Student) c.getBean("mystudent");
        System.out.println(s.getId());
        System.out.println(s.getName());
        List<String>subject=s.getSubjectname();
        for(String sub:subject){
            System.out.println(sub);
        }
    }
}
