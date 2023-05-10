package com.nt.controller;

import java.util.Date;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowHomeController {

	@GetMapping("/")
	public String shoeHomePage(Map<String,Object> map) {
		System.out.println("ShowHomeController.shoeHomePage()");
		System.out.println("map is refering to"+map.getClass());
		map.put("sysDate", new Date());
		map.put("attr1", "val1");
		map.put("page", new Random().nextInt(1000));
		return "welcome";
	}
}
