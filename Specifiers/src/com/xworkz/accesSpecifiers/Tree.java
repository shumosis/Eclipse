package com.xworkz.accesSpecifiers;

public class Tree 
{
	private String name = "mango";
	String ownerName;
	String town;
	String seasonOfFruit;
	int height;
	int yearofPlanting;
	int noOfFruits;
	boolean giveOxygen;
	boolean takeCo2;
	boolean lovetree;
	boolean Shadow;
	
	public Tree(String ownerName, String town, String seasonOfFruit, int height, int yearofPlanting, int noOfFruits,
			boolean giveOxygen, boolean takeCo2, boolean lovetree, boolean shadow) {
		super();
		this.ownerName = ownerName;
		this.town = town;
		this.seasonOfFruit = seasonOfFruit;
		this.height = height;
		this.yearofPlanting = yearofPlanting;
		this.noOfFruits = noOfFruits;
		this.giveOxygen = giveOxygen;
		this.takeCo2 = takeCo2;
		this.lovetree = lovetree;
		Shadow = shadow;
	}
	public String getName() {
		return this.name =name;
	}
    void setName(String name) {
		this.name=name;
	}

}
