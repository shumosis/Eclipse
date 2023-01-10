package com.xworkz.springWork.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworkz.springWork.configuration.SpringConfig2;
import com.xworkz.springWork.things2.Rocket;

public class SpringRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfig2.class);
		System.out.println(spring.getBeanDefinitionNames());
		
		Rocket  rocket1 = spring.getBean("rocket",Rocket.class);
		
		Rocket  rocket2 = spring.getBean("secondObject",Rocket.class);
		
		System.out.println(rocket1);
	System.out.println(rocket1.getName());	
	System.out.println(rocket1.getCountry());	
	System.out.println(rocket1.getBudget());
	
	
	System.out.println(rocket2);
System.out.println(rocket2.getName());	
System.out.println(rocket2.getCountry());	
System.out.println(rocket2.getBudget());

	
	

	}

}
