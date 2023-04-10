package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.springrest.springrest.dao.StudentDao;
@Entity
public class Student  {
	@Id
	private Long id;
	private String name;
	private String city;
	public Student(Long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
