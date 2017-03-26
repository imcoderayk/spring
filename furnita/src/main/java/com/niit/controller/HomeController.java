package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
public String gohome(){
		return "index";
	}
	@RequestMapping("contact")
	public String contactus(){
			return "contact";
	}
	@RequestMapping("register")
	public String SignUp(){
			return "reg";
	}
	@RequestMapping("login")
	public String log(){
			return "login";
	}
}
