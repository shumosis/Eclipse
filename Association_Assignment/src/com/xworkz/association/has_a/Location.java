package com.xworkz.association.has_a;

public class Location {

	public String street;
	public City_p city;
	public State state;
	public Country country;
	
	public Location(String street, City_p city, State state, Country country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public void showoflocation()
	{
	System.out.println(street);
	state.showOfStates();
	country.showOfCountry();
	city.shoeOfCity();

	}
	
	
}
