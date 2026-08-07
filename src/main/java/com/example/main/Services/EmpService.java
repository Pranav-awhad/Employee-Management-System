package com.example.main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.Entities.Employee;
import com.example.main.Repositary.EmpRepository;

@Service
public class EmpService {
	@Autowired
	EmpRepository empRepo;
	
	public List<Employee> getAllEmployees() {					
		return empRepo.findAll();   // This method returns all the Objects from database
	}
	
	public Employee getEmployeeById(int id) {
		return empRepo.findById(id).orElse(null);		// this method Finds the Employee by id
	}
	
	public void insertEmployee(Employee e) {
		empRepo.save(e);				// Saves or persist the object in the database
	}
	
	public Employee updateEmployeeById(int id, Employee e) {		//this method takes the id and an Employee Object
		Employee emp = empRepo.findById(id).orElse(null);		// first find the employee with the id in the database
		emp.setName(e.getName());		//then Update the Employee which is been selected
		emp.setSalary(e.getSalary());					
		empRepo.save(emp);				//save it in the database
		return emp;			//Also return that employee object
	}
	
	public void deleteEmployeeById(int id) {
		empRepo.deleteById(id);				//Delete the Object by id
	}
}
