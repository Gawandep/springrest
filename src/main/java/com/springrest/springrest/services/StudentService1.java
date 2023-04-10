package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Student;

public interface StudentService1 {

	

	 public List<Student> getStudent();
	 
	 public Student getStudent(long studentId);
	 
	 public Student addStudent(Student student);
	 
	 public Student updateStudent(Student student);
	 
	 public void deleteStudent(long parseLong);
	 

}
