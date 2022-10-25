package com.xworkz.shumos;

public class Lamp {
	
	public static boolean brightLight=true ;
	public String name;
	public double price;
	public SweetColor color=SweetColor.WHITE;
	public double quantity ;
	
	public Lamp (String name) {
		
		this.name=name;
	}
	
	public void setprice(double price) {
		
		this.price=price;
	
	}
	
	public void getTotal() {
		
		double total = quantity* price;
		
		System.out.println(total);
	}
	
	public void ShoeToMe() 
	{
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.color);
		System.out.println(this.quantity);
		System.out.println(brightLight);
		
	}

}
