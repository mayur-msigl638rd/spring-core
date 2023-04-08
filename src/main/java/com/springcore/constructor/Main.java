package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[])
{
	   ApplicationContext ctx = new ClassPathXmlApplicationContext("springConstructor.xml");
	   Person p = (Person) ctx.getBean("person1");
          
	   System.out.println(p);
	   
	   Addition ad = (Addition) ctx.getBean("add");
	   ad.doSum();

}
}
