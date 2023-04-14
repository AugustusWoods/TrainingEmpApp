package com.example.myempapp_mysql.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String firstName;
    private String lastName;
    private String department;
    private LocalDate dateOFJoining;
    
    public Employee() {}
    
    public Employee(long id, String firstName, String lastName, String department, LocalDate dateOFJoining) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.department = department;
	this.dateOFJoining = dateOFJoining;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getDateOFJoining() {
        return dateOFJoining;
    }

    public void setDateOFJoining(LocalDate dateOFJoining) {
        this.dateOFJoining = dateOFJoining;
    }
    
}
