package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Repository.StudentRepo;
import com.springrest.springrest.entities.Student;
import com.springrest.springrest.entities.User;
import com.springrest.springrest.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	public StudentService service;
	
	@Autowired
	public  StudentRepo studentRepo;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student)
	{
		return studentRepo.save(student);
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		return studentRepo.findAll();
	}
	

}
