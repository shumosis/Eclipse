package com.xworkz.springWork.things;

import org.springframework.stereotype.Component;

@Component
public class BhashyamCircle {

	public BhashyamCircle() {
		System.out.println("running method from bhashyam circle");
	}

	@Override
	public String toString() {
		System.out.println("to string riunning");
		return "Shubas";
	}

}
