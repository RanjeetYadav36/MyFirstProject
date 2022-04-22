package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.User;
import com.springrest.springrest.services.UserService;

@RestController
public class MyController {
	
	
	@Autowired
	public UserService service;
	
	
	
	//List of users
	@GetMapping("/users")
	public List<User>getUser(){
		return this.service.getUser();
		}

@PostMapping("/users")
public User addUser(@RequestBody User user) {
	return this.service.addUser(user);
	
}

@PutMapping("/users")
public User updateUser(@RequestBody User user) {
	return this.service.UpdateUser(user);
}


}