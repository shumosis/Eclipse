package com.xworkz.shumoss.overriding;

public class Sattelite extends Moon {
	
	public String name;
	
	public Sattelite(String shape, double distance,String name) {
		super(shape, distance);
		this.name =name;
		
	}
	public void showme() {
		super.showme();
		System.out.println(name);
	}

	
}
