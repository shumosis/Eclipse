package com.xworkz.shumos;

public class Cracker {
	public static String shopName="garve" ;
	public String name;
	public double price;
	public  Crackerfestival festival= Crackerfestival.DIWALI;
	public double quantity ;
	
	public Cracker(String name) {
		
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
		System.out.println(this.festival);
		System.out.println(this.quantity);
		System.out.println(shopName);
		
	}

}
