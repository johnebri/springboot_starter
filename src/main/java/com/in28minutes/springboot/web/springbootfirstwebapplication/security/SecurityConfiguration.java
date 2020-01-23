package com.in28minutes.springboot.web.springbootfirstwebapplication.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@ConfigurationProperties
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	// Create user - in28Minutes/dummy
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication().withUser("in28Minutes").password("dummy")
				.roles("USER", "ADMIN");
	}
	
	// Create a Login form 

}
