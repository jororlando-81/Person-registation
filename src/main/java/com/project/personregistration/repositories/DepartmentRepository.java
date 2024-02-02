package com.project.personregistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.personregistration.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
