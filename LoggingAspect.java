package com.mondee;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;


@Aspect
public class LoggingAspect {
	
	@Before	("execution(* com.mondee.EmployeeService.addEmployee())")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("logbefore() is running");
		System.out.println("before"+joinPoint.getSignature().getName()+"method");
	}
	

}
