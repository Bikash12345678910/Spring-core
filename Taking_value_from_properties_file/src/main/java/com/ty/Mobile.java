package com.ty;

public class Mobile {
    String name;
    int price;
    public Mobile(String name,int price){
        this.name=name;
        this.price=price;
    }
    public void display(){
        System.out.println(name);
        System.out.println(price);
    }


}
