package com.springcore;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	Student student1 = (Student) ctx.getBean("student1");
    	Student student2 = (Student) ctx.getBean("student2");
    	Student student3 = (Student) ctx.getBean("student3");
    	
    	ArrayList<Student> al = new ArrayList<Student>();
    
    	al.add(student1);
    	al.add(student2);
    	al.add(student3);
    	
    	System.out.println(al);
    	
    	
         
    }
}
