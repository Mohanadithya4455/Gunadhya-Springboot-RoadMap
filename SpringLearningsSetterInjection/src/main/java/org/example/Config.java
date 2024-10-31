package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    Address address(){
        Address address=new Address();
        address.setCity("Hyderabad");
        address.setHouse_no("1000");
        address.setPincode("12345");
        return address;
    }
     @Bean
    Employee employee(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Adithya");
        employee.setAddress(address());
         return employee;
    }

}
