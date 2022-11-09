package com.xworkz.shumoss.overriding;

public class Harshita extends  Director{
	
	public String education;
	
	public Harshita(String name, String directorOf,String education) {
		super(name, directorOf);
		this.education=education;
	}
	public void showtome() {
		
		super.showtome();
		
		System.out.println(education);
	}
	
}
