package com.shori.myHealthSpringboot.Controllers;

import org.springframework.stereotype.Service;

@Service
public class LoginBusinessRules {

	
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("hemant") && password.equals("hemant");
	}

}
