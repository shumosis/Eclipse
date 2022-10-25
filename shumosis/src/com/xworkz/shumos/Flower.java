package com.xworkz.shumos;

public class Flower {
	
	public static String flowerFor="sweetgirl" ;
	public String name;
	public double price;
	public Flowercolor  color=Flowercolor.RED;
	public double quantity ;
	
	public Flower(String name) {
		
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
		System.out.println(flowerFor);
		
	}

}
