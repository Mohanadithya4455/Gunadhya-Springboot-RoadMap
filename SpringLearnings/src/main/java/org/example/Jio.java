package org.example;

public class Jio implements Sim{
    @Override
    public void calling() {
        System.out.println("This is the calling method from jio");
    }

    @Override
    public void messaging() {
        System.out.println("This is the messaging method from jio");
    }
}
