package com.example.myempapp_mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myempapp_mysql.model.Employee;
import com.example.myempapp_mysql.service.EmployeeService;

@CrossOrigin
@RestController
@RequestMapping("/employees")
public class EmployeeControlller {
    
    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping
    public List<Employee> getAllEmployees(){
	return employeeService.getAllEmployees();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
	
	Employee employee = employeeService.getEmployeeById(id);
	if(employee != null) {
	    return new ResponseEntity<>(employee, HttpStatus.OK);
	} else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
    }
    
    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
	
	employeeService.addEmployee(employee);
	return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee){
	
	employeeService.updateEmployee(id, employee);
	return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") Long id){
	
	employeeService.deleteEmployee(id);
	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
