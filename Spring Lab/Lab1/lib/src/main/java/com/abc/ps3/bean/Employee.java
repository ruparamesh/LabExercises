package com.abc.ps3.bean;

import java.util.Collection;
import java.util.List;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private String businessUnit;
	private int age;
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public int getAge() {
		return age;
	}
	
	public void getDetails(Collection<Employee> sbu) {
		System.out.println("Employee details");
		System.out.println("---------------------------------");
		System.out.print(String.format("Employee [empAge=%d, empId=%d, empName=%s, empSalary=%f\nsbu details=SBU [", this.age,this.employeeId,this.employeeName,this.salary));
		this.getSbuDetails(sbu);
	}
	
	public void getSbuDetails(Collection<Employee> sbu) {
		System.out.println(sbu.toString()+"]]");		
	}
}
	
