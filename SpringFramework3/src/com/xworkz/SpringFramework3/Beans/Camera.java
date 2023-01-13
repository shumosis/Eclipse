package com.xworkz.SpringFramework3.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	private Lens  lens;
	@Autowired
	private Battery battery;
	
	public Camera() {
		System.out.println("running camera");
		//System.out.println("lens :"+lens.hashCode());
		//System.out.println("battery :"+battery.hashCode());
	}

}
