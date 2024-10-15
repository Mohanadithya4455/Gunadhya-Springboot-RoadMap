package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Address address = context.getBean(Address.class);
        Employee employee =  context.getBean(Employee.class);
        System.out.println(employee);
    }
}