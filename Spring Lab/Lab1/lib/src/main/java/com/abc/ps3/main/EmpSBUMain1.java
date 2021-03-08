package com.abc.ps3.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.ps3.bean.Employee;
import com.abc.ps3.bean.SBU;

public class EmpSBUMain1 {

	public static void main(String[] args) {
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		
		Employee empBean = (Employee) context.getBean("emp1");
		SBU sbu = (SBU) context.getBean("emp_sbu1");
		
		empBean.getDetails(sbu.getEmpList());
		
		context.close();

	}

}
