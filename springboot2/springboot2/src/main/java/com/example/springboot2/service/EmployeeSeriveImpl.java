package com.example.springboot2.service;

import com.example.springboot2.model.Employee;
import com.example.springboot2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeSeriveImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        Employee emp = new Employee();
        emp.setId(employee.getId());
        emp.setName(employee.getName());
        emp.setAge(employee.getAge());
        emp.setSalary(employee.getSalary());
        emp.setEmail(employee.getEmail());
        return employeeRepository.save(emp);
    }

    @Override
    public Employee getEmployeeById(int employeeId) throws Exception {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if(!employee.isPresent()){
            throw new Exception("Employee not found with this "+employeeId);
        }
        return employee.get();
    }

    @Override
    public List<Employee> getAllEmployees(int pageNo,int size) {
        Pageable pageable = PageRequest.of(pageNo,size);
        Page<Employee> page = employeeRepository.findAll(pageable);
        List<Employee> employeeList = page.getContent();
        return employeeList;
    }

    @Override
    public Employee updateEmployeeById(int id,Employee employee) throws Exception {
        Employee emp = getEmployeeById(id);
        emp.setAge(employee.getAge());
        emp.setName(employee.getName());
        emp.setSalary(employee.getSalary());
        emp.setEmail(employee.getEmail());
          return employeeRepository.save(emp);

    }

    @Override
    public void deleteEmployeeById(int employeeId) throws Exception {
        Employee emp = getEmployeeById(employeeId);
        employeeRepository.deleteById(employeeId);
    }
}
