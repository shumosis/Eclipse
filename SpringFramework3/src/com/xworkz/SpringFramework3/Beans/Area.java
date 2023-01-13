package com.xworkz.SpringFramework3.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Area {
	
	public Area() {
		System.out.println("running area");
	}
	
	private String name  ;

	public String getName() {
		return name;
	}
    
	@Value("rajajinagar")
	public void setName(String name) {
		this.name = name;
		System.out.println("name");
	}
	
	

}
