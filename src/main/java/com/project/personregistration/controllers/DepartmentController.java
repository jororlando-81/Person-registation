package com.project.personregistration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.personregistration.entities.Department;
import com.project.personregistration.repositories.DepartmentRepository;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@PostMapping
	public Department insert ( @RequestBody Department department ){
		Department newdepartment  = departmentRepository.save(department);
		return newdepartment;  
	}
	
}
