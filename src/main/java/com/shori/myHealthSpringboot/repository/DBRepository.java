package com.shori.myHealthSpringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.shori.myHealthSpringboot.Controllers.Patient;

@Service
public interface DBRepository extends JpaRepository<Patient, Integer>{

	public List<Patient> findByfirstName(String firstName);

}
