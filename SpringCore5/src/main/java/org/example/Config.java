package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@ComponentScan(basePackages = "org.example")
public class Config {

    @Bean
    public Employee employee(){
        Employee employee = new Employee();
        employee.setName("Adithya");
        employee.setTasks(new ArrayList<String>(Arrays.asList("developing Admin panel","developing Dashboard")));
        Set<String> set = new HashSet<>();
        set.add("9876543210");
        set.add("8907654321");
        employee.setPhoneNumbers(set);
        Map<String,String> map = new HashMap<>();
        map.put("02/09/2024","Birthday");
        map.put("30/03/2024","Family Function");
        employee.setLeaves(map);
        return employee;

    }
}
