package com.project.personregistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.personregistration.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
