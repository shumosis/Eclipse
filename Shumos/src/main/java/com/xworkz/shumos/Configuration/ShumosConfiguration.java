package com.xworkz.shumos.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.shumos")
public class ShumosConfiguration {
	
	public ShumosConfiguration() {
	  System.out.println("creating " + this.getClass().getSimpleName());
	}

}
