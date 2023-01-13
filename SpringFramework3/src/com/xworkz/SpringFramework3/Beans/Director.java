package com.xworkz.SpringFramework3.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
	private Experience experience;
	@Autowired
	private Skill skill;
	
	public Director() {
		System.out.println("running Director");
		//System.out.println("Experience :"+experience.hashCode());
		//System.out.println("skill :"+skill.hashCode());
	}
	
	

}
