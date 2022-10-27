package com.xworkz.shumos;

public class Milk {
	public static String shopName="more" ;
	public String type;
	public double price;
	public Color color=Color.WHITE;
	public double quantity ;
	
	public Milk (String type) {
		
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
