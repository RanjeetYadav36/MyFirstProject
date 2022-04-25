package com.springrest.springrest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
