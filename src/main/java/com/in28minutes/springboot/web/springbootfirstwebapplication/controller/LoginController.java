package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.springbootfirstwebapplication.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired // implement dependency injection
	LoginService service;
	
	// LoginService service = new LoginService(); // without dependency injection
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	// public String loginMessage(@RequestParam String name, @RequestParam String company, ModelMap model) {
	public String showLoginPage(ModelMap model) {
		model.put("name", "in28Minutes");
//		model.put("company", company);
		return "welcome";
	}
	
/*	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String showWelcomePage(
			@RequestParam String name,
			@RequestParam String password,
			ModelMap model) {
		
		boolean isValidUser = service.validateUser(name, password);
		
		if(!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}*/

}
