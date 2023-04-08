package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[])
	{
		 ApplicationContext  ctx  =   new ClassPathXmlApplicationContext("springRef.xml");
		 A a =(A) ctx.getBean("aRef");
		 
		 System.out.println(a.getX());
		 System.out.println(a.getOb().getY());
		 System.out.println(a);
		 
	}

}
