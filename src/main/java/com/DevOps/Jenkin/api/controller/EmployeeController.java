package com.DevOps.Jenkin.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DevOps.Jenkin.api.Entity.Employee;
import com.DevOps.Jenkin.api.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	public EmployeeService employeeService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
		
		employeeService.saveEmployee(employee);
		
		return ResponseEntity.ok("Employee added successfully");
		
	}
	
	@GetMapping()
	public ResponseEntity<List<Employee>> getAllEmployee(){
		
		List<Employee> employees=employeeService.findEmployee();
		
		return ResponseEntity.ok(employees);
		
	}
	
	@GetMapping("/{Id}")
	public ResponseEntity<Employee>getById(@PathVariable String Id){
		
		Employee singleEmp=employeeService.findById(Id);
		
		return ResponseEntity.ok(singleEmp);
	}
	
	public ResponseEntity<Employee> updateEmployee(@PathVariable String Id,@RequestBody Employee employee){
		
		Employee updatedEmp=employeeService.updateEmployeeById(employee,Id);
		
		return ResponseEntity.ok(updatedEmp);
		
	}
	
}
