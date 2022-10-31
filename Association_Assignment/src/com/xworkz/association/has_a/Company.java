package com.xworkz.association.has_a;

public class Company {
	
	public String name;
	public String ownerName;
	public Address addres ;
	
	
	public Company(String name, String ownerName, Address addres) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.addres = addres;
	}
	public void showofcompany()
	{
	System.out.println(name);	
	System.out.println(ownerName);
     addres.shoeofAdress();
	}

}
