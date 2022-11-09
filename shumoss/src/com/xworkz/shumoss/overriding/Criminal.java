package com.xworkz.shumoss.overriding;

public class Criminal {

	public String name;
	public String offense;
	
	
	public Criminal(String name, String offense) {
		super();
		this.name = name;
		this.offense = offense;
	}
	
	public void display() {
		
		System.out.println(name);
		System.out.println(offense);
	}
	
	
	
}
