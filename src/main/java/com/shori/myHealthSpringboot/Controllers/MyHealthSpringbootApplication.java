package com.shori.myHealthSpringboot.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.shori.myHealthSpringboot.repository.DBRepository;

@EnableJpaRepositories(basePackages = "com.shori.myHealthSpringboot.repository")
@SpringBootApplication
public class MyHealthSpringbootApplication implements CommandLineRunner {

	@Autowired
	DBRepository dbRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyHealthSpringbootApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
      dbRepository.save(new Patient(007,"dddd","ooo","999999"));
		
	}
	

}
