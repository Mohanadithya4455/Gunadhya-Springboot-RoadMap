package org.example;

public class Airtel implements Sim{

    @Override
    public void calling() {
        System.out.println("This is the calling method from airtel");
    }

    @Override
    public void messaging() {
        System.out.println("This is the messaging method from airtel");
    }
}
