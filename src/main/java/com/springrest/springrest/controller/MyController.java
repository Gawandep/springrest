package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Student;
import com.springrest.springrest.services.StudentService1;

@RestController
public class MyController {
	@Autowired
	private StudentService1 studentservice;
    //get the student
	@GetMapping("/student")
	public List<Student> getStudents()
	{
		return this.studentservice.getStudent();
	}
	//single student get
	 @GetMapping("/student/{studentId}")
	 public  Student getStudent(@PathVariable String studentId)
	 {
		 return this.studentservice.getStudent(Long.parseLong(studentId));
		 }
	 //student add
	 @PostMapping("/student")
	 public Student addStudent(@RequestBody Student student) {
	 return this.studentservice.addStudent(student);
}
   //update student using put request
    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student) {
    	return this.studentservice.updateStudent(student);
    }	
   //delete the student
    @DeleteMapping("/student/{studentId}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String StudentId)
    {
    	try {
    		this.studentservice.deleteStudent(Long.parseLong(StudentId));
    		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    	}
    	catch(Exception e) {
    		return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    
    
    	}
    	
	 
}

	 
