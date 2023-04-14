package com.example.myempapp_mysql.service;

import java.util.List;
import com.example.myempapp_mysql.model.Employee;

public interface EmployeeService {
    
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    void addEmployee(Employee employee);
    void updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);

}
