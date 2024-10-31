package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Product product(){
        Product product = new Product(1,"Bike",5);
        return product;
    }
}
