package com.ammad.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
	
}
