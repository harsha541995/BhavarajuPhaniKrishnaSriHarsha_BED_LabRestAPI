package com.gl.security.studentmgmt.service;

import com.gl.security.studentmgmt.entity.Student;

//import antlr.collections.List;

import java.util.List;

public interface StudentService {

	public List <Student> findAll();
	
	public Student findById(int theId);
	
	public void save(Student student);
	
	public void deleteById(int theId);
	
}
