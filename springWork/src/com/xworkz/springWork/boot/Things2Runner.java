package com.xworkz.springWork.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springWork.configuration.Springconfig1;

public class Things2Runner {

	public static void main(String[] args) {
		
		ApplicationContext manag =  new AnnotationConfigApplicationContext(Springconfig1.class);
		
		String[] beanNames = manag.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		String getBeanName = manag.getBean("getchair",String.class);
		System.out.println(getBeanName.hashCode());
	
		String getBeanName1 = manag.getBean("getTable",String.class);
		System.out.println(getBeanName1.hashCode() );
		
		Double getBeanName2 = manag.getBean("salary",Double.class);
		System.out.println(getBeanName2.hashCode());

	}

}
