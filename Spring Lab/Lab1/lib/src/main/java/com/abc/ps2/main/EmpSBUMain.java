package com.abc.ps2.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.ps2.bean.Employee;
import com.abc.ps2.bean.SBU;

public class EmpSBUMain {

	public static void main(String[] args) {
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		
		Employee empBean = (Employee) context.getBean("emp1");
		SBU sbu = (SBU) context.getBean("emp_sbu");
		
		empBean.getDetails(sbu);
		
		context.close();

	}

}
