package com.xworkz.springFramework4.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springFramework4.beans.*;
public class Things2Runner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(com.xworkz.springFramework4.configuration.SpringConfiguration2.class);
		
		System.out.println(container.getBeanDefinitionNames());
		
		
		HardwareShop refhardwareShop =container.getBean(HardwareShop.class) ;
		System.out.println(refhardwareShop );
		
		
	

	}

}
