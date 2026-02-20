package com.codeo.company.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeo.company.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}