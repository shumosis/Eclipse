package com.xworkz.springFramework2.configuration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springFramework2.things.Actor;
import com.xworkz.springFramework2.things.Rocket;
import com.xworkz.springFramework2.things.Season;

@Configuration
@ComponentScan("com.xworkz.springFramework2")
public class SpringConfig {
	
	@Bean
	public Rocket secondObject() {
		
		System.out.println("creating new object with method");
		Rocket rocket = new Rocket();
		return rocket;
	}
	
	@Bean
	public Actor secondActor() {
		System.out.println("creating seconmd objet");
		 Actor  actor = new  Actor("manu","kannada",24);
	return actor;
		
	}
	@Bean
	public Season secondSeason() {
	System.out.println("running second season");
		Season season2 = new Season();
		season2.setDuration(8);
		season2.setName("summer");
		season2.setStartingMonth("may");
		System.out.println(season2.getName());
		System.out.println(season2.getDuration());
		System.out.println(season2.getStartingMonth());
		return season2;
		
	}
	

}
