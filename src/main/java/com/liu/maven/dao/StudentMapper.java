package com.liu.maven.dao;

import com.liu.maven.model.Student;

public interface StudentMapper {

	//public void save(Student student);
	
	public Student getStudentById(int id);
}
