package com.xworkz.SpringFramework3.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	@Autowired
	private Area area;
	

	public Location() {
		System.out.println("running Loaction");
	    //area.setName("rajajinagr");
		//System.out.println("area : "+area.getName());
	}
    public void test() {
    	System.out.println("area ;"+area.hashCode());
    	System.out.println(area.getName());
    }

}
