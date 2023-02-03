package com.xworkz.samosa.springConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.samosa")
public class SamosaConfiguration {

	
	public SamosaConfiguration() {
		System.out.println("creating " + this.getClass().getSimpleName());
	}
}
