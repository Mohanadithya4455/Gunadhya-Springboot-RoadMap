package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("spring.xml");
       Employee employee = context2.getBean(Employee.class);
      System.out.println(employee.getName());
       context2.registerShutdownHook();
    }
}