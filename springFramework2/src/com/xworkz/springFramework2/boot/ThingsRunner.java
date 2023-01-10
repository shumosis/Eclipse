package com.xworkz.springFramework2.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springFramework2.configuration.SpringConfig;
import com.xworkz.springFramework2.things.Actor;
import com.xworkz.springFramework2.things.Rocket;
import com.xworkz.springFramework2.things.Season;

public class ThingsRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(spring.getBeanDefinitionNames());
		Rocket rocket1=spring.getBean("rocket",Rocket.class);
		
		Rocket rocket2=spring.getBean("secondObject",Rocket.class);
		
		System.out.println(rocket1);
	System.out.println(rocket1.getName());	
	System.out.println(rocket1.getCountry());	
	System.out.println(rocket1.getBudget());
	
	
	System.out.println(rocket2);
System.out.println(rocket2.getName());	
System.out.println(rocket2.getCountry());	
System.out.println(rocket2.getBudget());

	Actor  actor1= spring.getBean("actor", Actor.class);
	Actor  actor2= spring.getBean("secondActor", Actor.class); 
	
	
	System.out.println(actor1);
	System.out.println(actor1.getAge());
	System.out.println(actor1.getLang());
	System.out.println(actor1.getName());
	
	System.out.println(actor2);
	System.out.println(actor2.getAge());
	System.out.println(actor2.getLang());
	System.out.println(actor2.getName());
	
	Season season1= spring.getBean("season",Season.class);
	
	Season season2= spring.getBean("secondSeason",Season.class);
	
	 System.out.println(season1);
	System.out.println(season1.getDuration());
	System.out.println(season1.getName());
	System.out.println(season1.getStartingMonth());
	
	season2.setDuration(4);
	season2.setName("summer");
	season2.setStartingMonth("april");
	System.out.println(season2);
	System.out.println(season2.getDuration());
	System.out.println(season2.getName());
	System.out.println(season2.getStartingMonth());
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
