/**
 * 
 */
package com.test.employeeservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.employeeservice.models.Employee;

/**
 * @author sasi
 *
 */
@RestController("/employeeservice")
public class EmployeeService {

	@PostMapping
	public ResponseEntity<Employee> createEmployee(Employee emp) {
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}
}
