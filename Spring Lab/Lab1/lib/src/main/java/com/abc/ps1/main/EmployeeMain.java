package com.abc.ps1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.ps1.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		 Employee emp=(Employee) context.getBean("emp");
		 System.out.println("Employee details");
		 System.out.println("----------------------------------");
		 System.out.println("Employee ID : "+emp.getEmployeeId());
		 System.out.println("Employee Name : "+emp.getEmployeeName());
		 System.out.println("Employee Salary : "+emp.getSalary());
		 System.out.println("Employee BU : "+emp.getBusinessUnit());
		 System.out.println("Employee Age : "+emp.getAge());

	}

}
