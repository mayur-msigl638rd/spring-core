package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("springLifecycle.xml");
	
	  ctx.registerShutdownHook(); // for this method we are using AbstractApplicationContext
	// Samosa samosa1 = (Samosa) ctx.getBean("samosa1");
	// System.out.println(samosa1);
	
	 
	/*
	 * System.out.println("+++++++++++++"); Pepsi p1 = (Pepsi)
	 * ctx.getBean("pepsi1"); System.out.println(p1);
	 */
	  
	  Example example1 = (Example) ctx.getBean("example1");
	  System.out.println(example1);
	 
	}

}
