package com.cck.EmployeeManagementAPI.service;

import com.cck.EmployeeManagementAPI.model.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {
    public Employee saveEmployee(Employee employee);
    public Optional<Employee> getEmployeeById(int id);
    List<Employee> getAllEmployee();
    Employee updateEmployee(int id, Employee employee);
    ResponseEntity<Object> deleteEmployee(int id);
}
