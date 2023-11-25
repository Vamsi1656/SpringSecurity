package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepository;



public class EmpController {
	
	@Autowired
	EmpRepository repo;
	
	@PostMapping("/employee")
	public Employee createEmp(@RequestBody Employee emp) {
		
		Employee emp1=repo.save(emp);
		return emp1;
	}

}
