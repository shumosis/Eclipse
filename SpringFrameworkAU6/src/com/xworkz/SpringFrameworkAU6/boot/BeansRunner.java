package com.xworkz.SpringFrameworkAU6.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.SpringFrameworkAU6.beans.Chrome;
import com.xworkz.SpringFrameworkAU6.beans.FireFox;
import com.xworkz.SpringFrameworkAU6.configuration.BeansConfiguration;

public class BeansRunner {

	public static void main(String[] args) {
		
		ApplicationContext bhogane = new AnnotationConfigApplicationContext(BeansConfiguration.class);
        String string= Arrays.toString(bhogane.getBeanDefinitionNames());
		System.out.println(string);
		System.out.println(bhogane.getBeanDefinitionCount());
		Chrome chromeRef=bhogane.getBean(Chrome.class);
		chromeRef.browse();
		
		FireFox firefoxref = bhogane.getBean(FireFox.class);
		firefoxref.browse();
		
		
	}

}
