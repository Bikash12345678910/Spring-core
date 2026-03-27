package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trainer_of_pw {
    int id;
    String name;
    public Trainer_of_pw(@Value(value="101") int id,@Value(value = "Bikash") String name){
        this.id=id;
        this.name=name;
    }
}
