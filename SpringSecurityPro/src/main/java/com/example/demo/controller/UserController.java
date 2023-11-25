package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;

public class UserController {
	
	@Autowired
	UserRepository repo;
	
	@PostMapping("/user")
	public Users createUsers(@RequestBody Users user) {
		
		Users user1=repo.save(user);
		return user1;
	}
	
	
	

}
