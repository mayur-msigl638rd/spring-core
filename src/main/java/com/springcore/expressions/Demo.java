package com.springcore.expressions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    
	@Value("#{22+11}")
	private int x;
	
	@Value("#{2+3+323+3}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(4)}") //static method
	private double z;
	
	@Value("#{T(java.lang.Math).E}")   //static variable
	private double e;
	
	@Value("#{T(java.lang.Math).PI}") // static variable
	private double pi;
	
	@Value("#{new java.lang.String('Mayur')}")  // String object
	private String name;
	
	@Value("#{8>3}")
	private boolean isActive;
	
	
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	
	
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pi=" + pi + ", name=" + name + ", isActive="
				+ isActive + "]";
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
