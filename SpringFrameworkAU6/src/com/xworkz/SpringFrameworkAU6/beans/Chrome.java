package com.xworkz.SpringFrameworkAU6.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser{
  @Autowired
  @Qualifier("jio")
  
	private Provider provider;
	
	@Override
	public void browse() {
	System.out.println("running browse method from chrome");
	
	provider.connect();
	}

}
