package com.shori.myHealthSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.shori.myHealthSpringboot.Controllers.Patient;

public interface DBRepository extends JpaRepository<Patient, Integer>{

}
