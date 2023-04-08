package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
public static void main(String args[])
{
	     ApplicationContext ctx= new AnnotationConfigApplicationContext(javaConfig.class);
	   //  Student student   =   ctx.getBean("firststudent", Student.class);
         Student student = ctx.getBean("con", Student.class); //with bean
	     student.study();
         
         
}
}
