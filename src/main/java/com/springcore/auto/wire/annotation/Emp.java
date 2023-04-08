package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;


public class Emp {
    // @Autowired -- we can use here at property

	private Address address;

	public Address getAddress() {
		return address;
	}
   // @Autowired -- we can also use here on setter
	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
    //@Autowired -- we can use here at constructor
	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Insisde Constructor...");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
