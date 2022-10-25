package com.xworkz.shumos;

public class Sweet {
	
	public static String shopName="kanli" ;
	public String name;
	public double price;
	public SweetColor color=SweetColor.PINK;
	public double quantity ;
	
	public Sweet(String name) {
		
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
		System.out.println(shopName);
		
	}

}
