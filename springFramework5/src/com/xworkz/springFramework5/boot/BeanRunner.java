package com.xworkz.springFramework5.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springFramework5.beans.Engine;
import com.xworkz.springFramework5.beans.Ghost;
import com.xworkz.springFramework5.beans.NewsPaper;
import com.xworkz.springFramework5.beans.Snake;
import com.xworkz.springFramework5.configuration.SpringConfiguration;

public class BeanRunner {

	public static void main(String[] args) {
		
		ApplicationContext bucket = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Ghost ghost=bucket.getBean("ghost",Ghost.class);
		
		System.out.println(ghost);
		
		NewsPaper newsPaper= bucket.getBean(NewsPaper.class);
	    
		System.out.println(newsPaper);
		
		Snake snake= bucket.getBean(Snake.class);

		System.out.println(snake);
		
		Engine engine = bucket.getBean(Engine.class);
		System.out.println(engine);
	}

}
