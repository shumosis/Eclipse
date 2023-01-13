package com.xworkz.SpringFramework3.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Autowired
	private Director director;
	@Autowired
	private Prouducer prouducer;
    @Autowired
	private Cameraman cameraman;
	
	
	public Movie() {
		System.out.println("running movie");
		//System.out.println("director :"+director.hashCode());
		//System.out.println("prouducer :"+prouducer.hashCode());
		//System.out.println(("cameraman :"+cameraman.hashCode()));
	}
	
	public void check() {
		System.out.println("director :" +director.hashCode());
	    prouducer.test3();
	}
}
