package com.xworkz.shumoss.overriding;

public class Director {
	
	public String name;
	public String  directorOf;
	
	public Director(String name, String directorOf) {
		super();
		this.name = name;
		this.directorOf = directorOf;
	}
	
	public void showtome() {
		System.out.println(name);
		System.out.println( directorOf);
	}

}
