package com.xworkz.accesSpecifiers;

public class Akshay 
{
	private String town = "bagalkot";
	String clg;
	String friend;
	String gf;
	int height;
	int birthYear;
	int weight;
	boolean drink;
	boolean smoke;
	boolean goodBoy;
	int shirtSize;
	
	public Akshay(String clg, String friend, String gf, int height, int birthYear, int weight, boolean drink,
			boolean smoke, boolean goodBoy, int shirtSize) {
		super();
		this.clg = clg;
		this.friend = friend;
		this.gf = gf;
		this.height = height;
		this.birthYear = birthYear;
		this.weight = weight;
		this.drink = drink;
		this.smoke = smoke;
		this.goodBoy = goodBoy;
		this.shirtSize = shirtSize;
	}
	 public String getTown() 
	 {
		return this.town=town;
	 }
	 void setTown(String town) 
	 {
		this.town=town; 
	 }
	 

}
