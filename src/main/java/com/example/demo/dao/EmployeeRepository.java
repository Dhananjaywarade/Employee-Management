package com.example.demo.dao;

import com.example.demo.entity.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

	public List<Employee> findAllByOrderByLastNameAsc();
}
