package com.DevOps.Jenkin.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DevOps.Jenkin.api.Entity.Employee;
import com.DevOps.Jenkin.api.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepo employeeRepo;
	
	public  saveEmployee(Employee employee) {
		
		employeeRepo.save(employee);
	}
	
	public List<Employee> findEmployee(){
		return employeeRepo.findAll();
	}
	
	public Employee findById(String Id) {
		
	   return employeeRepo.findById(Id).get();
	}
	
	public Employee updateEmployeeById(Employee employee,String Id) {
		
		Employee existingEmployee=employeeRepo.findById(Id).get();
		Employee updatedEmployee =new Employee(); 
		updatedEmployee.setCompanyName(existingEmployee.getCompanyName());
		updatedEmployee.setEmailId(existingEmployee.getEmailId());
		updatedEmployee.setName(existingEmployee.getName());
		
		return updatedEmployee;
			
	}
}
