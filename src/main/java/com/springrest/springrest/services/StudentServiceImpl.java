package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.StudentDao;
import com.springrest.springrest.entities.Student;
@Service
public class StudentServiceImpl implements StudentService1 {
	  @Autowired
	  private StudentDao studentdao;
	
	  //List<Student> list;
	public StudentServiceImpl()
	{
	 //   list=new ArrayList<Student>();
	//	list.add(new Student(3,"Pooja","Pune"));
	//	list.add(new Student(9,"Dipali","Mumbai"));
		}
	public List<Student> getStudent() {
		return studentdao.findAll();
	}
	public Student getStudent(long studentId)
	{ 
		return studentdao.getOne(studentId);
	}
	
	public Student addStudent(Student student)
	{
		studentdao.save(student);
		return student;
		
	} 
	public Student updateStudent(Student student)
	{
		studentdao.save(student);
		return student;
	}
	public void deleteStudent(long parseLong)
	{
		Student entity=studentdao.getOne(parseLong);
		studentdao.delete(entity);
	}
	{
		
		
	
		

	}
	}
		


