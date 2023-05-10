package com.nt.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentOperationController {

	// URL - http://localhost:8084/MVCProj-06-DataBinding-UsingRequestParams/report?sno=101&sname=raja
	/*@GetMapping("/report")
	public String showData(@RequestParam("sno") int no,@RequestParam("sname") String name) {
		System.out.println(no+" "+name);
		return "show_result";
	}*/

	// URL - http://localhost:8084/MVCProj-06-DataBinding-UsingRequestParams/report?sno=101&sname=raja
	@GetMapping("/report")
	public String showData(@RequestParam int sno, @RequestParam String sname) {
		System.out.println(sno + " " + sname);
		return "show_result";
	}

	// URL - http://localhost:8084/MVCProj-06-DataBinding-UsingRequestParams/report?sno=101
	@GetMapping("/report1")
	public String showData1(@RequestParam int sno,
			@RequestParam(required = false, defaultValue = "Sumit") String sname) {
		System.out.println(sno + " " + sname);
		return "show_result";
	}

	// URL -http://localhost:8084/MVCProj-06-DataBinding-UsingRequestParams/report2?sno=102&sname=raj,ram,df
	@GetMapping("/report2")
	public String showData2(@RequestParam int sno,@RequestParam(required = false, defaultValue = "Sumit") String sname[],
			                @RequestParam("sname")List<String>names,@RequestParam("sname")Set<String>names1) {
		System.out.println(sno + " " +Arrays.toString(sname)+" "+names+" "+names1);
		return "show_result";
	}
}
