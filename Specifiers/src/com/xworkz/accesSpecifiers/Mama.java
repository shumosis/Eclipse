package com.xworkz.accesSpecifiers;

public class Mama {
	
	private String town = "Chickodi";
	String name;
	String childern;
	String wife;
	int height;
	int birthYear;
	int weight;
	boolean drink;
	boolean smoke;
	boolean goodMama;
	String friend;
	
	public Mama(String name, String childern, String wife, int height, int birthYear, int weight, boolean drink,
			boolean smoke, boolean goodMama, String friend) {
		super();
		this.name = name;
		this.childern = childern;
		this.wife = wife;
		this.height = height;
		this.birthYear = birthYear;
		this.weight = weight;
		this.drink = drink;
		this.smoke = smoke;
		this.goodMama = goodMama;
		this.friend = friend;

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