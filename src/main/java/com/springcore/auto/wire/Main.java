package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("sprngAutoWiring.xml");
	              Emp emp = ctx.getBean("emp", Emp.class);
	           
	              System.out.println(emp);
	         
	}

}
