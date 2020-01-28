package com.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeManagementApplication {
	
	@Autowired
	EmpRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Bean
	CommandLineRunner loadData() {
		return (e) -> {
			repo.save(new Employee("Syam", "Engg"));
			repo.save(new Employee("Ravi", "Ops"));
			repo.save(new Employee("Sumanth", "Mktg"));
		};
	}
}
