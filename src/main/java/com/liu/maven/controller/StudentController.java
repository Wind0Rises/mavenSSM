package com.liu.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student/")
public class StudentController {
	
	@RequestMapping("list")
	public ModelAndView list(){
		return new ModelAndView("/student/list");
	}
	
}
