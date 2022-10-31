package com.xworkz.association.has_a;

public class Address {
	
	public Location location;

	public Address(Location location) {
		super();
		this.location = location;
	}
	public void shoeofAdress() 
	{
		location.showoflocation();
	}

}
