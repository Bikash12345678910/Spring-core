package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Driver {
    public static void main(String[]args){
        ConfigurableApplicationContext c=new ClassPathXmlApplicationContext("configuration.xml");
        Shop s=(Shop) c.getBean("myshop");
        System.out.println(s.getId());
        System.out.println(s.getName());
        Map<String,Double>map=s.getItems();
        for(Map.Entry<String,Double>entry:map.entrySet()){
            System.out.println(entry);
        }
    }
}
