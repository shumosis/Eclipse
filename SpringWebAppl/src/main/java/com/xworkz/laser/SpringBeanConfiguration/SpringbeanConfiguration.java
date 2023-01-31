package com.xworkz.laser.SpringBeanConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.laser")
public class SpringbeanConfiguration {
	
	public SpringbeanConfiguration() {
	  System.out.println("creating " + this.getClass().getSimpleName());
	}

}
