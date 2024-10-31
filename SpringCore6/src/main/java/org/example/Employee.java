package org.example;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
@Component
public class Employee {
    private String name;
    private List<String> tasks;
    private Set<String> phoneNumbers;
    private Map<String,String> leaves;


    public Employee(String name, List<String> tasks, Set<String> phoneNumbers, Map<String, String> leaves) {
        this.name = name;
        this.tasks = tasks;
        this.phoneNumbers = phoneNumbers;
        this.leaves = leaves;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", tasks=" + tasks +
                ", phoneNumbers=" + phoneNumbers +
                ", leaves=" + leaves +
                '}';
    }
}
