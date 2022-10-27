package com.xworkz.associations.things;

public class Location {
	
	public String Street;
	public String city;
	public String state;
	public double pincode;
	public String country;
	
	public void aksha(String street, String city, String state, double pincode, String country) {
		this.Street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}
	 public void showmeLocation() {
		 System.out.println(Street);
		 System.out.println(city);
		 System.out.println(state);
		 System.out.println(pincode);
		 System.out.println(country);
	 }
	

}
