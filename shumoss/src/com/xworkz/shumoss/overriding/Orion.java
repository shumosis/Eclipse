package com.xworkz.shumoss.overriding;

public class Orion extends ShoppingMall {
	
	public String owner;

	public Orion(String name, String area,String owner) {
		super(name,area);
		this.owner=owner;
		
	 }
    public void Display() {
    	super.Display();
    	System.out.println(owner);
    }
	
}