package com.xworkz.springWork.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.springWork.things2.Rocket;

@Configuration
@ComponentScan

public class SpringConfig2 {
	@Bean
	public void secondObject() {
		
		System.out.println("creating new object with method");
		Rocket rocket4 = new Rocket();
		
	}
	
}
