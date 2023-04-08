package com.springcore.constructor;

import java.util.List;

public class Person {
 
	private String name;
	private int id;
	private Certificate certi;
	private List<String>list;
	
	public Person(String name, int id, Certificate certi, List<String>list) {
		super();
		this.name = name;
		this.id = id;
		this.certi = certi;
		this.list = list;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.name + " " +this.id + " {" + this.certi.getName() + "}" + " " +this.list;
	}
	
	
}
