package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeRepo;
import com.example.demo.model.Employee;



@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepo employeerepo;
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee() {
		
		
		 return employeerepo.findAll();
		
	}
	
	@PostMapping("/saveEmployee")
	public void loadEmployee(@RequestBody Employee employee) {
		
		employeerepo.save(employee);
		
		System.out.println("Successfully saved the Employee.....");
	}

}
