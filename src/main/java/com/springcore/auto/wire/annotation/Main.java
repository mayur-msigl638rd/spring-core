package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springAutoWiringAnnotation.xml");
	              Emp emp = ctx.getBean("emp", Emp.class);
	           
	              System.out.println(emp);
	         
	}

}
