package com.springrest.springrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.User;

public interface UserService {

	List<User>getUser();	
	public User addUser(User user);
	public User UpdateUser(User user);
	public User getSingleUser(Long id);
}
