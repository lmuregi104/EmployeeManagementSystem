package com.example.employeeManagement2.service;

import com.example.employeeManagement2.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    Employee save(Employee employee);

    Employee getById(Long id);

    void deleteById(Long id);

}
