package com.spring.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/test")
	private String testService() {
		Employee emp = new Employee();
		emp.setEmpName("venu");
		employeeRepository.save(emp);
		return "saved...";
	}

}
