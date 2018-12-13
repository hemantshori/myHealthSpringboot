package com.shori.myHealthSpringboot.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;

import com.shori.myHealthSpringboot.Controllers.Patient;




public class PatientService {
	
	@Autowired
	Patient patient;
	
	
	public void addPatienttoDB(Patient patient) {
		patient.setFirstName("asfd");
		patient.setLastName("vffv");
		patient.setPhone("234234234");
	}

}
