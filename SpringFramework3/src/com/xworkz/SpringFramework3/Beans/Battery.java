package com.xworkz.SpringFramework3.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	
	
	@Autowired 
	private Capacity capacity;
    
	
	public  Battery() {
		System.out.println("running battery");
		//System.out.println("Capacity :"+capacity.hashCode());
	}
}
