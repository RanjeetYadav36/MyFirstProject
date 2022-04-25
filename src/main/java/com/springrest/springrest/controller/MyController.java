package com.springrest.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.springrest.springrest.Exceptions.UserNotFoundException;
import com.springrest.springrest.Repository.UserRepo;
import com.springrest.springrest.entities.User;
import com.springrest.springrest.services.UserService;

@RestController
public class MyController {
	
	
	private static final Exception NotFoundException = null;

	@Autowired
	public UserService service;
	
	@Autowired
	public UserRepo userRepo;
	
	
	
	@GetMapping("/users")
	public  ResponseEntity<List<User>>getUser() throws ResponseStatusException{
		try {
		List<User> users = this.service.getUser();
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity(HttpStatus.NOT_FOUND );
		}
		

	
		}

	@GetMapping("/users/{id}")
	  ResponseEntity<User> getSingleUser(@PathVariable Long id) {
	
		System.out.println("50");
		User user =service.getSingleUser(id);
		System.out.println("52" + user.toString());
		if(!(user== null)) {
			System.out.println("53");
			throw new UserNotFoundException("user not found for this id", NotFoundException);
		}
		
		else
			return new ResponseEntity<User>(user,HttpStatus.OK);

	}
	
	@DeleteMapping("/users/{id}")
	void deleteSingleUser(@PathVariable Long id) throws Exception{

		try {
		this.userRepo.deleteById(id);
		}
		catch(Exception e) {
			throw  NotFoundException;
		}
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