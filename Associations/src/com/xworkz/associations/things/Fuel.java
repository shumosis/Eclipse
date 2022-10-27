package com.xworkz.associations.things;

public class Fuel {
	
	public Brand brand;
	public boolean special;
	public Typeenum type = Typeenum.PETROL ;
	public int price;
	public int quanty;
	
	
	public Fuel(Brand brand, boolean special, int price, int quanty) {
		super();
		this.brand = brand;
		this.special = special;
		this.price = price;
		this.quanty = quanty;
	}
	
	public void showMeFuel() {
		
		System.out.println(special);
		System.out.println(type);
		System.out.println( price);
		System.out.println(quanty);
	}
	

}
