package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new
                AnnotationConfigApplicationContext(Config.class);
        Device apple=context.getBean("apple",Laptop.class);
        Device realme=context.getBean("realme",Mobile.class);
        Shop shop=context.getBean(Shop.class);
        shop.list.add(apple);
        Shop shop1=context.getBean(Shop.class);
        shop1.list.add(realme);
        System.out.println(shop1);
    }
}