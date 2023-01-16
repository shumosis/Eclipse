package com.xworkz.SpringFrameworkAU6.beans;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider{

	@Override
	public void connect() {
		System.out.println("running connect method from airtel");
		
	}

}
