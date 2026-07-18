package com.DevOps.Jenkin.api.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.DevOps.Jenkin.api.Entity.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee,String> {

	
}
