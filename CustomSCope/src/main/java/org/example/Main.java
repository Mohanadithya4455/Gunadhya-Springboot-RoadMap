package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Thread{
    public static void main(String[] args) {

        Main t1= new Main;
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CustomBean scope =  new CustomBean();


    }
}