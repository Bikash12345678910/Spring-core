package com.ty;

public class Employee {
    int id;
    int salary;
     Employee(int id,int salary){
         this.id=id;
         this.salary=salary;
     }
     public void display(){
         System.out.println("id is"+id);
         System.out.println("salary is "+salary);
     }

}
