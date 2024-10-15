package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BeanFactory context = new ClassPathXmlApplicationContext("beans.xml");
        Airtel airtel=context.getBean(Airtel.class);
        Jio jio=context.getBean(Jio.class);
        airtel.calling();
        jio.messaging();
    }
}