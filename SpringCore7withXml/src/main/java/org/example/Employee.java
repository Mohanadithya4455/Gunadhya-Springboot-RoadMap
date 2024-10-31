package org.example;

public class Employee {
    String name;

    public void starting(){
        System.out.println("Bean is created");
    }
    public void ending(){
        System.out.println("Bean is ended");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
