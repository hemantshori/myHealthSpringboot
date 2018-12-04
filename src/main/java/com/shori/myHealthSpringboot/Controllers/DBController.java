package com.shori.myHealthSpringboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.shori.myHealthSpringboot.repository.DBRepository;


import java.util.List;


@RestController
@RequestMapping(value = "/test")
public class DBController {

	@Autowired
	DBRepository dbRepository;

	
	@GetMapping(value= "/all")
	public List<Patient> getAll()
	{

		return dbRepository.findAll();
		
		
	}
	
	@RequestMapping(value = "/{firstName}", method = RequestMethod.GET)
	public List<Patient> getByFirstName(@PathVariable("firstName") final String firstName) {

	     

	      return dbRepository.findByfirstName(firstName);
	
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Patient> getList(@RequestParam String name, @RequestParam String password, ModelMap model) {

	      List<Patient> xx = dbRepository.findAll();

	      return xx;
	
	}
}

