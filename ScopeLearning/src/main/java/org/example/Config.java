package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.example")
public class Config {

    @Bean
    public Device apple(){
        Laptop laptop = new Laptop("mac_book",100000);
        return laptop;

    }

    @Bean
    public Device realme(){
        Mobile mobile = new Mobile("real x50",45000);
        return mobile;
    }
}
