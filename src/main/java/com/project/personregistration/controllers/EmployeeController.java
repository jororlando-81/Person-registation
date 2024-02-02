package com.project.personregistration.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.personregistration.entities.Employee;
import com.project.personregistration.repositories.EmployeeRepository;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping
	public Employee insert ( @RequestBody Employee employee ){
		Employee newEmployee  = employeeRepository.save(employee);
		return newEmployee;  
	}
	
	@GetMapping
	public List<Employee> findALL(){
		List<Employee> listEmployees = employeeRepository.findAll();
		return listEmployees ;
	}
	
	@GetMapping(value = "/{id}")
	public Employee findById( @PathVariable Long id){
		Employee idEmployee = employeeRepository.findById(id).get();
		return idEmployee ;
	}
	

}
