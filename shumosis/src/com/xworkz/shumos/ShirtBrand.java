package com.xworkz.shumos;

public class ShirtBrand {
	
	public static String shopName="Ajio" ;
	public String name;
	public double price;
	public SweetColor color=SweetColor.BLACK;
	public double quantity ;
	
	public ShirtBrand(String name) {
		
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
