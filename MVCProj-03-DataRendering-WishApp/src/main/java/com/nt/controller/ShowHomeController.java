package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishMesageService;

@Controller
public class ShowHomeController {
	
	@Autowired
	private IWishMesageService service;

	@RequestMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	@RequestMapping("/wish")
	public String showWishMessage(Map<String,Object> map) {
		String msg=service.generateWishMessage();
		map.put("wmsg", msg);
		return "show_result";
	}
}
