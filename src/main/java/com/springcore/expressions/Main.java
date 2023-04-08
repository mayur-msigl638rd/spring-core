package com.springcore.expressions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springExpressions.xml");
	    Demo d1 =ctx.getBean("demo", Demo.class);	
	    System.out.println(d1);
	    
	    
	    //Another example
	    SpelExpressionParser temp = new SpelExpressionParser();
	    Expression  expression = temp.parseExpression("32+423");
	    System.out.println(expression.getValue());
	    
	    
	    
	}

}
