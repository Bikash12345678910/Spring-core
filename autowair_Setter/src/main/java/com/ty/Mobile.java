package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    private String name;
    private int price;
    private int id;

    public String getName() {
        return name;
    }
        @Value(value="POCO")
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    @Value(value="100")
    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }
        @Value(value="101")
    public void setId(int id) {
        this.id = id;
    }
}
