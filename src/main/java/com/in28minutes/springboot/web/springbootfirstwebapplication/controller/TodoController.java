package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.in28minutes.springboot.web.springbootfirstwebapplication.service.TodoService;




@Controller
public class TodoController {
	
	@Autowired // implement dependency injection
	TodoService service;
	
	// LoginService service = new LoginService(); // without dependency injection
	
	@RequestMapping(value="/list-todos", method=RequestMethod.GET)
	// public String loginMessage(@RequestParam String name, @RequestParam String company, ModelMap model) {
	public String showTodosList(ModelMap model) {
		model.put("todos", service.retrieveTodos("in28Minutes"));
		return "list-todos";
	}
	


}
