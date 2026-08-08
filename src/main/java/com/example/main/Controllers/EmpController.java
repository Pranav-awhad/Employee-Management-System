package com.example.main.Controllers;						

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.Entities.Employee;
import com.example.main.Services.EmpService;
													
@RestController
public class EmpController {					//This is the Controller layer which is responsible for Http request and responses
	
	@Autowired
	EmpService empService;			//This maps the empService class and spring automatically creates the object here
	
	@GetMapping("/getallemp")
	public List<Employee> getAllEmployees() {					
		return empService.getAllEmployees();
	}
	
	@GetMapping("/getemp/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return empService.getEmployeeById(id);
	}
	
	@PostMapping("/insertemp")
	public void insertEmployee(@RequestBody Employee e) {
		empService.insertEmployee(e);
	}
	
	@PutMapping("/updateemp/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee e) {
		return empService.updateEmployeeById(id, e);
	}
	
	@DeleteMapping("/deleteemp/{id}")
	public void deleteEmployee(@PathVariable int id) {
		empService.deleteEmployeeById(id);
	}
}
