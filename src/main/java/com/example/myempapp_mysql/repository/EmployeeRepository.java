package com.example.myempapp_mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.myempapp_mysql.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
