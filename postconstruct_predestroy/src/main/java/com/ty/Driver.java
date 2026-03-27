package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[]args){
        ConfigurableApplicationContext c=new ClassPathXmlApplicationContext("configuration.xml");
        c.close();
    }

}
