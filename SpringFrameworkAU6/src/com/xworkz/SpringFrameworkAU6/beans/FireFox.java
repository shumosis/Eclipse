package com.xworkz.SpringFrameworkAU6.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireFox implements Browser {
	@Autowired
	@Qualifier("airtel")
	private Provider provider;

	@Override
	public void browse() {
		System.out.println("runnig browse method from firefox");
		
		provider.connect();
		
	}

}
