package com.ty;

import org.springframework.stereotype.Component;

@Component
public class Bike {
    public void ride(){
        System.out.println("Riding bike with annotation");
    }
}
