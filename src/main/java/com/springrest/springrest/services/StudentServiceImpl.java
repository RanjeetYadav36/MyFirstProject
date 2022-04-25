package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Repository.StudentRepo;
import com.springrest.springrest.entities.Student;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	public StudentRepo studentRepo ;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		Student st =  studentRepo.save(student);
		return st;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
