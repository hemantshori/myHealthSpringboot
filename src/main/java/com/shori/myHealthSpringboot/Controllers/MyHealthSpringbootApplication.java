package com.shori.myHealthSpringboot.Controllers;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.shori.myHealthSpringboot.repository")
@SpringBootApplication
public class MyHealthSpringbootApplication {


	public static void main(String[] args) {
		SpringApplication.run(MyHealthSpringbootApplication.class, args);
		
	}
	

}
