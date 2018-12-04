package com.shori.myHealthSpringboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.shori.myHealthSpringboot.repository.DBRepository;
import com.shori.myHealthSpringboot.resource.UserResource;

import ch.qos.logback.classic.net.SyslogAppender;

import java.io.Console;
import java.util.List;

@Controller
public class WelcomeController {

	@Autowired
	LoginBusinessRules loginBusinessRules;
	@Autowired
	DBRepository dbRepository;


	@RequestMapping("/login")
	public String loginPage() {
		System.out.println("Welcome to controller");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (!loginBusinessRules.validateUser(name, password)) {
			model.put("errorMessage", "you have provided incorrect credentials");

			return "login";
		}

		model.put("message", name);
		return "patientDetails";
	}
	
	
	// capture details from page and save it to DB
	
	@RequestMapping(value = "/patientDetails", method = RequestMethod.POST)
	public String getDataFromPage(@RequestParam String firstName, @RequestParam String lastName, 
			@RequestParam String phone,
			@RequestParam String address, ModelMap model) {
		
		
		model.put("firstName", firstName);
		model.put("lastName", lastName);
		model.put("address", address);
		model.put("phone", phone);
		

		return "welcome";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String handleUserLogin(){
     
		
		return "login";
	}
}

