package com.jabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jabs.entity.EmployeeEntity;
import com.jabs.service.SpringDataService;

@RestController
public class SpringDataController {
	@Autowired
	private SpringDataService springDataService;
	
	@RequestMapping("/allEmployees")
	public List<EmployeeEntity> findEmployees() {
		return springDataService.getAllEmployees();
	}
}
