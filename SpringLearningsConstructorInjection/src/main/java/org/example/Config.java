package org.example;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Address address(){
        Address address =new Address("1000","Hyderabad","12345");
        return address;

    }
    @Bean
    public Employee employee(){
        Employee employee = new Employee(1,"Adithya",address());
        return employee;
    }
}
