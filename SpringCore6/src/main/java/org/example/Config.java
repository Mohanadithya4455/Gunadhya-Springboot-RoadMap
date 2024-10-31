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

       List<String> list=new ArrayList<String>(Arrays.asList("developing Admin panel","developing Dashboard"));
        Set<String> set = new HashSet<>();
        set.add("9876543210");
        set.add("8907654321");

        Map<String,String> map = new HashMap<>();
        map.put("02/09/2024","Birthday");
        map.put("30/03/2024","Family Function");
        Employee employee = new Employee("Adithya",list,set,map);
        return employee;

    }
}
