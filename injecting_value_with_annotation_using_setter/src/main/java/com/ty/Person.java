package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
     int age;

    public int getAge() {
        return age;
    }
    @Value(value="24")
    public void setAge(int age) {
        this.age = age;
    }
}
