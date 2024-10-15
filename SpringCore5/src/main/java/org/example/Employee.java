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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Map<String, String> getLeaves() {
        return leaves;
    }

    public void setLeaves(Map<String, String> leaves) {
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
