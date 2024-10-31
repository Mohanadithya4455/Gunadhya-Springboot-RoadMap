package com.example.springboot2.controller;


import com.example.springboot2.model.Employee;
import com.example.springboot2.service.EmployeeSeriveImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeSeriveImpl employeeServiceImpl;

    @PostMapping("/save")
    public Employee saveEmployee(@Valid @RequestBody Employee employee){
        return employeeServiceImpl.saveEmployee(employee);
    }

    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable("id") int employeeId) throws Exception {
        Employee employee = employeeServiceImpl.getEmployeeById(employeeId);
        return employee;
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(@RequestParam("pageNo") int pageNo,@RequestParam("size") int size){
        return employeeServiceImpl.getAllEmployees(pageNo,size);
    }
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id,@RequestBody Employee employee) throws Exception {
        return employeeServiceImpl.updateEmployeeById(id,employee);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable int id) throws Exception {
        employeeServiceImpl.deleteEmployeeById(id);
    }

}
