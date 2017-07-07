package com.liu.maven.service.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.maven.model.Student;
import com.liu.maven.service.StudentService;

public class StudentServiceImplTest {

	@Test
	public void testSave() {
		/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-application.xml");
		
		System.out.println(applicationContext);
		
		
		StudentService service = (StudentService) applicationContext.getBean("studentService");
		service.save(new Student());
		*/
	}
	
	@Test
	public void testStudentByIdTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-application.xml");
		System.out.println(applicationContext);
		StudentService service = (StudentService) applicationContext.getBean("studentService");
		Student student = service.getStudentById(2);
		System.out.println(student.getUsername());
	}

}
