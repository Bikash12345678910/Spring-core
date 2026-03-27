package com.ty;

import org.springframework.stereotype.Component;

@Component
public class Samsung implements Mobile{
    public void call(){
        System.out.println("Calling from Samsung");
    }
}
