package com.xworkz.accesSpecifiers;

public class Girl 
{

	private String name =" na nimg yak helali" ;
	String clg;
	String friend;
	boolean bf;
	int height;
	int birthYear;
	int weight;
	boolean drink;
	boolean smoke;
	boolean cute;
	String goodgirl;
	
	
	public Girl(String clg, String friend, boolean bf, int height, int birthYear, int weight, boolean drink,
			boolean smoke, String goodgirl, boolean cute) {
		super();
		this.clg = clg;
		this.friend = friend;
		this.bf = bf;
		this.height = height;
		this.birthYear = birthYear;
		this.weight = weight;
		this.drink = drink;
		this.smoke = smoke;
		this.goodgirl = goodgirl;
		this.cute = cute;
	}
	 public String getName() 
	 {
		return this.name=name;
	 }
	 void setName(String name) 
	 {
		this.name=name; 
	 }
	
	

}
