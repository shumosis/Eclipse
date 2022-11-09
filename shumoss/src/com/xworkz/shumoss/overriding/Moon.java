package com.xworkz.shumoss.overriding;

public class Moon {
	
	public String shape;
	public double distance;
	
	public Moon(String shape, double distance) {
		super();
		this.shape = shape;
		this.distance = distance;
	}
	
	public void showme() {
		System.out.println(shape);
		System.out.println(distance);
	}

}
