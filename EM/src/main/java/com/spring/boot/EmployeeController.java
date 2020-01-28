package com.spring.boot;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//restcontroller -- controller + responsebody
//@Controller
@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class EmployeeController {

	@Autowired
	EmpRepo repo;

	@RequestMapping("/employees")
//	@ResponseBody
	List<Employee> getEmployee() {
		return (List<Employee>) repo.findAll();
	}

	@RequestMapping("/emp/{eid}")
//	@ResponseBody
	Optional<Employee> getEmployee(@PathVariable("eid") int empId) {
		return (repo.findById(empId));
	}

	@RequestMapping("/empl")
	Optional<Employee> getEmployeeParams(@RequestParam("empId") int empId) {
		return (repo.findById(empId));
	}
}
