package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Employee employee = context.getBean(Employee.class);
        Address address = context.getBean(Address.class);
        address.setPincode("123456");
        address.setCity("Hyderabad");
        employee=new Employee(address);
        System.out.println(employee);
    }
}