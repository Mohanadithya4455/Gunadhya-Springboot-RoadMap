package com.example.springboot2.service;

import com.example.springboot2.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public Employee getEmployeeById(int employeeId) throws Exception;
    public List<Employee> getAllEmployees(int pageNo,int size);
    public Employee updateEmployeeById(int employeeId,Employee employee) throws Exception;
    public void deleteEmployeeById(int employeeId) throws Exception;
}
