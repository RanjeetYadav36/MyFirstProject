package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Student;

public interface StudentService {

	public List<Student> getAllStudent();
	public Student addStudent(Student student);
	 
}