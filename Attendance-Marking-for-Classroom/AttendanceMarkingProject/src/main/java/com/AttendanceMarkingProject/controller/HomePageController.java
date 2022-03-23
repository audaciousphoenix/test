package com.AttendanceMarkingProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	
	@GetMapping("login")
	public String usertype()
	{
		return "LoginHome";
	}

}
