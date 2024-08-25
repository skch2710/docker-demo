package com.docker.docker_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.docker.docker_demo.model.Employee;

@Repository
@Transactional
public interface EmployeeDAO extends JpaRepository<Employee, Long> {

}
