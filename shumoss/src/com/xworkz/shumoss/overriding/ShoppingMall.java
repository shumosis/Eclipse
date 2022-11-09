package com.xworkz.shumoss.overriding;

public class ShoppingMall {
	
	public String name;
	public String area;
	
	public ShoppingMall() {
	}
	public ShoppingMall(String name, String area) {
		this.name = name;
		this.area = area;
	}
    public void  Display() {
    	
    	System.out.println(name);
    	System.out.println(area);
    }
}
