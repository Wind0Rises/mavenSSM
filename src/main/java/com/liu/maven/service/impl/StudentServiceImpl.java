package com.liu.maven.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.liu.maven.dao.StudentMapper;
import com.liu.maven.model.Student;
import com.liu.maven.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper studentMapper;
	
	/*@Override
	public void save(Student student) {
		System.out.println("this is studentServiceImpl of save method!");
		studentMapper.getStudentById(id)
	}*/

	@Override
	public Student getStudentById(int id) {
		return studentMapper.getStudentById(id);
	}

}
