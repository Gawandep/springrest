package com.springrest.springrest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Student;

public interface StudentDao extends JpaRepository<Student,Long> {





}
