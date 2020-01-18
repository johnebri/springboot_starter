package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.springbootfirstwebapplication.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired // implement dependency injection
	TodoService service;
	
	// LoginService service = new LoginService(); // without dependency injection
	
	@RequestMapping(value="/list-todos", method=RequestMethod.GET)
	// public String loginMessage(@RequestParam String name, @RequestParam String company, ModelMap model) {
	public String showTodosList(ModelMap model) {
		String name = (String) model.get("name");
		model.put("todos", service.retrieveTodos(name));
		return "list-todos";
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.GET)
	public String showAddTodo(ModelMap model) {
		return "todo";
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.POST)
	public String addTodo(ModelMap model, @RequestParam String desc) {
		service.addTodo((String)model.get("name"), desc, new Date(), false);
		model.clear();
		return "redirect:/list-todos";
	}
	


}
