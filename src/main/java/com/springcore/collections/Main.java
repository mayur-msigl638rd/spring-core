package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

	ApplicationContext	ctx = new ClassPathXmlApplicationContext("springCollections.xml");
	
	Emp emp1 = (Emp) ctx.getBean("emp1");
	
	System.out.println(emp1);
	
	System.out.println(emp1.getCourses());
	System.out.println(emp1.getAddress());
	System.out.println(emp1.getPhones().getClass().getName());
	
		
	}

}
