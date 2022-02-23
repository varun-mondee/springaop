package com.mondee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService employeeservice = context.getBean("employeeService", EmployeeService.class);
		employeeservice.addEmployee();
		employeeservice.modifyEmployee();
		employeeservice.deleteEmployee();

	}

}
