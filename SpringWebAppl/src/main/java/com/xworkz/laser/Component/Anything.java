package com.xworkz.laser.Component;

import org.springframework.stereotype.Component;

@Component
public class Anything {
	
	public Anything() {
		System.out.println("creating "+this.getClass().getSimpleName());
	}

}
