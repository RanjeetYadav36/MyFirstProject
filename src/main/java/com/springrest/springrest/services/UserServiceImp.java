package com.springrest.springrest.services;

import java.util.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Repository.UserRepo;
import com.springrest.springrest.entities.User;

@Service
public class UserServiceImp implements UserService {
@Autowired
private UserRepo userdao;
	//List<User> list;
	
	public UserServiceImp() {
		// TODO Auto-generated constructor stub
		/*list = new ArrayList<>();
		list.add(new User(1,"ram",12345));
		list.add(new User(2,"mohan",466897));
		list.add(new User(3,"saim",56896));
		*/
		}
	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userdao.findAll();
	}
	public User addUser(User user) {
		
		//list.add(user);
		//return user;
		 userdao.save(user);
		return user;
	}
	public User UpdateUser(User user) {
		userdao.save(user);
		return user;
	}
	public User getSingleUser(Long id) {
		User user = userdao.findById(id).get();
		return user;
	}

}
