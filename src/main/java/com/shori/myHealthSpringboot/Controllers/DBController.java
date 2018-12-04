package com.shori.myHealthSpringboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
}

