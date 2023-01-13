package com.xworkz.SpringFramework3.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	private Location location;
	
	public Company() {
		System.out.println("running company");
		//System.out.println("location :"+location.hashCode());
	}
	public void test2() {
		location.test();
	}

}
