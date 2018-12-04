package com.shori.myHealthSpringboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shori.myHealthSpringboot.repository.DBRepository;
import com.shori.myHealthSpringboot.resource.UserResource;
import java.util.List;

//@Controller
public class WelcomeController {

	@Autowired
	LoginBusinessRules loginBusinessRules;
	@Autowired
	DBRepository dbRepository;
	
	@Autowired
	Patient patient;

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
	
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Patient> getList(@RequestParam String name, @RequestParam String password, ModelMap model) {

	      List<Patient> xx = dbRepository.findAll();

	      return xx;
	
	}
}

