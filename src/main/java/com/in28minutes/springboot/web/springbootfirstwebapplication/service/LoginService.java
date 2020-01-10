package com.in28minutes.springboot.web.springbootfirstwebapplication.service;

import org.springframework.stereotype.Component;

@Component // makes this class a spring bean, for dependency injection
public class LoginService {
	
	public boolean validateUser(String userid, String password) {
		//in28minutes, dummy
		return userid.equalsIgnoreCase("in28minutes") 
				&& password.equalsIgnoreCase("dummy");
	}

}
