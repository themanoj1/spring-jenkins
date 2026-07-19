package com.DevOps.Jenkin.api.Entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employees")
public class Employee {

	@Id
	String employeeId =UUID.randomUUID().toString().replace("-","").substring(0,8);
	String name;
	String companyName;
	String emailId;
	
	public Employee() {
		
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmailId() {
		return emailId;
	}

	public  setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Employee(String employeeId, String name,String companyName,String emailId) {
		
		this.employeeId=employeeId;
		this.name=name;
		this.companyName=companyName;
		this.emailId=emailId;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
}
