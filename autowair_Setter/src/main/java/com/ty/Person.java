package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    Mobile m;
    public void display(){
        System.out.println(m.getId());
        System.out.println(m.getName());
        System.out.println(m.getPrice());
    }
}
