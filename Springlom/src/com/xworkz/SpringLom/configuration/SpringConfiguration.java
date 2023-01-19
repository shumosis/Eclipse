package com.xworkz.SpringLom.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.SpringLom")
public class SpringConfiguration {
	
	
	@Bean
	public Validator garve() {
		ValidatorFactory ref = Validation.buildDefaultValidatorFactory();
		Validator shumosis = ref.getValidator();
		return shumosis;
	}

}
