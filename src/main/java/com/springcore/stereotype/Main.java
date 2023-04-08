package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("springStereotype.xml");
          Student student = ctx.getBean("ob",Student.class);  // we write student becuase our class name is Student but here "s" should be small like Student  student = new Student(); 
	      //System.out.println(student);                              // or you can use here your defined "ob" object which you have defined in @Component("ob")   
	     // System.out.println(student.getAddress());
	     // System.out.println(student.getAddress().getClass().getName());
         // System.out.println(student.hashCode());                  
          Student student1 = ctx.getBean("ob", Student.class); // both student and student1 will give same hascode() value in case of singleton scope, so this is called singleton and this is by default.
         // System.out.println(student1.hashCode());
	      
          Teacher teacher = ctx.getBean("teacher", Teacher.class);
          Teacher teacher1 = ctx.getBean("teacher", Teacher.class);
          
          System.out.println(teacher.hashCode());
          System.out.println(teacher1.hashCode());
          
	
	}

}
