package com.xworkz.vadapav.vadaConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.vadapav")
public class FoodConfiguration {
	

	public FoodConfiguration() {
		System.out.println("Created.." + this.getClass().getSimpleName());
	}

}
