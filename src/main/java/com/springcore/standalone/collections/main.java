package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springStandaloneCollections.xml");;
		      Person person1 = ctx.getBean("person1", Person.class);
		      
		      System.out.println(person1);
		      
              System.out.println(person1.getFriends().getClass().getName());
	          System.out.println("***************");
	          System.out.println(person1.getFeestructure());
	          System.out.println(person1.getFeestructure().getClass().getName());
	          System.out.println("***************");
	          System.out.println(person1.getSyllabus());
	          System.out.println(person1.getSyllabus().getClass().getName());
	          System.out.println("***************");
	          System.out.println(person1.getProperties());
	          System.out.println(person1.getProperties().getClass().getName());
	}

}
