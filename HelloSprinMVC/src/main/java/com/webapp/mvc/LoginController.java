package com.webapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 
 * author omer samancioglu
 * 
 */

@Controller
public class LoginController {
	
	// This is a handler
	// redirecting to login.jsp
	// refer to src/main/webapp/WEB-INF/todo-servlet.xml file for prefix and suffix configuration
	
	@RequestMapping(value = "/login")	
	public String sayLogin() {
		return "login";
	}

}
