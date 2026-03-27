package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value(value="101")
    int id;
    @Value(value="Bikash")
    String name;
    @Value(value = "24")
    int age;
}
