package com.xworkz.shumos;

public class Mango {
	
	public static String shopName="joshiFruits" ;
	public String type;
	public double price;
	public MangoColor color=MangoColor.YELLOW;
	public double quantity ;
	
	public Mango(String name) {
		
		this.type=type;
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
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.color);
		System.out.println(this.quantity);
		System.out.println(shopName);
		
	}

}
