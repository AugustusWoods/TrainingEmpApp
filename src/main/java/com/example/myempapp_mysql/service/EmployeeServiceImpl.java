package com.example.myempapp_mysql.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.myempapp_mysql.model.Employee;
import com.example.myempapp_mysql.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
	// TODO Auto-generated method stub
	return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
	// TODO Auto-generated method stub
	return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void addEmployee(Employee employee) {
	// TODO Auto-generated method stub
	employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Long id, Employee employee) {
	// TODO Auto-generated method stub
	Employee existingEmployee = employeeRepository.findById(id).orElse(null);
	if(existingEmployee != null) {
	    existingEmployee.setFirstName(employee.getFirstName());
	    existingEmployee.setLastName(employee.getLastName());
	    existingEmployee.setDepartment(employee.getDepartment());
	    existingEmployee.setDateOFJoining(employee.getDateOFJoining());
	    employeeRepository.save(existingEmployee);
	}
    }

    @Override
    public void deleteEmployee(Long id) {
	// TODO Auto-generated method stub
	employeeRepository.deleteById(id);
    }

}
