package com.xworkz.SpringFramework3.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.SpringFramework3.Beans.Movie;
import com.xworkz.SpringFramework3.Beans.Prouducer;
import com.xworkz.SpringFramework3.Confguration.SpringConfiguration;

public class BeanRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext bucket = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		String[] ref = bucket.getBeanDefinitionNames();
		System.out.println(bucket.getBeanDefinitionNames());
		
		Movie movie =bucket.getBean(Movie.class);
		
		movie.check();

	}

}
