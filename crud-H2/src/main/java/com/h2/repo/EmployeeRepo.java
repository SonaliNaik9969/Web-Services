package com.h2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
