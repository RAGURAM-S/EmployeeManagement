package com.spring.boot;

import org.springframework.data.repository.CrudRepository;

public interface EmpRepo extends CrudRepository<Employee, Integer> {
//the crud repository contains the implementations of the database manipulation operations
}

