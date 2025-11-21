package com.kodewala.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login") // action name
	public String login() {
		System.out.println("LoginController.login()----------::::::::::::::::::::::::::::::::::::::::::::::::::::::;");
        if(true)
        {
		return "displayLogin"; // response, which page to display
        }
        else
        {
        	return "loginFailure";
        }
	}

	@RequestMapping("/logout") // action name
	public String logout() {
		System.out.println("LoginController.logout()::::::::::::::::::::::::::::::::::::::::::::::::::::::;");
		return "logout"; // view resolver --> logical name of the view("logout") --> physical path
		// /WEB-INF/views/logout.jsp

	}

}
