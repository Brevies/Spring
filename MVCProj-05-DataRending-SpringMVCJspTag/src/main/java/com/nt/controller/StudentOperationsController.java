package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudentOperationsController {

	@GetMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	
	@GetMapping("/student")
	public String showStudentFormPage(@ModelAttribute("stud") Student st) {
		System.out.println("model class obj data ::"+st);
		return"student_form";
	}
	@PostMapping("/student")
	public String processStudentForm(@ModelAttribute("stud") Student st,
			Map<String,Object>map) {
		System.out.println("Form data ::"+st);
		String result=null;
		//write b.logic 
		if(st.getSavg()<35)
			result="fail";
		else
			result="pass";
		map.put("resultData", result);
		return "show_result";
	}
}
