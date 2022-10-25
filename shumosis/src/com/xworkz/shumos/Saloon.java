package com.xworkz.shumos;

public class Saloon {
	
	public static String saloonName="MassMahraj" ;
	public String barberName;
	public double price;
	public String cutName;
	public boolean isRaviTejaIsGoodHajam;
	
	public Saloon(String barberName) {
		
		this.barberName=barberName;
	}
	
	public void setprice(double price) {
		
		this.price=price;
	
	}
	

	
	
	public void ShoeToMe() 
	{
		System.out.println(this.barberName);
		System.out.println(this.price);
		System.out.println(this.cutName);
		System.out.println(this.isRaviTejaIsGoodHajam);
		System.out.println(saloonName);
		
	}

}
