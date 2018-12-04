package com.shori.myHealthSpringboot.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.shori.myHealthSpringboot.Controllers.Patient;
import com.shori.myHealthSpringboot.repository.DBRepository;


@RestController
@RequestMapping(value = "rest/patients")
public class UserResource {

	
	
	@Autowired 
	DBRepository dbRepository;
	
	
	
	@GetMapping(value = "/all")
	
	public List<Patient> getAll()
	{
		return dbRepository.findAll();
	}
	
	
	@PostMapping(value = "/load")
	public List<Patient> persist(@RequestBody final Patient patient)
	{
		return dbRepository.findAll();
		
	}
}
