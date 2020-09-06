package com.jabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jabs.entity.EmployeeEntity;
import com.jabs.repository.EmployeeRepository;

@Service
public class SpringDataService {
	@Autowired
	EmployeeRepository repository;
	
	public List<EmployeeEntity> getAllEmployees() {
		return repository.findAll();
	}
}
