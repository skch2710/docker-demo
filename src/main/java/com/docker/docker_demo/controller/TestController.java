package com.docker.docker_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/docker")
public class TestController {

	@GetMapping("/demo-api")
	public ResponseEntity<?> demoApi() {
		return ResponseEntity.ok("Demo Docker Spring Boot....");
	}

}
