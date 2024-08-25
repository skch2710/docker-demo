package com.docker.docker_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.docker_demo.dao.EmployeeDAO;
import com.docker.docker_demo.model.Employee;

@RestController
@RequestMapping("/api/v1/docker")
public class TestController {

	@Autowired
	private EmployeeDAO employeeDAO;

	@GetMapping("/demo-api")
	public ResponseEntity<?> demoApi() {
		return ResponseEntity.ok("Demo Docker Spring Boot....");
	}
	
	@PostMapping("/emp-save")
	public ResponseEntity<?> saveEmp(@RequestBody Employee employee) {
		employee = employeeDAO.save(employee);
//		employee = employeeDAO.getReferenceById(employee.getEmpId());
		return ResponseEntity.ok(employee);
	}

}
