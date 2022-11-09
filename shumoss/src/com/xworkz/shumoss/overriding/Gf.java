package com.xworkz.shumoss.overriding;

public class Gf extends Criminal {
	
	public boolean Criminal;
	
	public Gf(String name, String offense, boolean Criminal) {
		super(name, offense);
		this.Criminal=Criminal;
	}
   public void display() {
	super.display();
	
	System.out.println( Criminal);
}
}
   
