package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	private List<String> friends;
	private Map<String, Integer>feestructure;
	private Set<String> syllabus; 
	private Properties properties;

	public Set<String> getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(Set<String> syllabus) {
		this.syllabus = syllabus;
	}

	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestructure=" + feestructure + ", syllabus=" + syllabus
				+ ", properties=" + properties + "]";
	}

	
	
	

	
}
