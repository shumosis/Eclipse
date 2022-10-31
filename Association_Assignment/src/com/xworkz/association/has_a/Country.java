package com.xworkz.association.has_a;

public class Country {
	
	public String name;
	public String pm;
	public String capital;
	public int states;
	
	public Country(String name, String pm, String capital, int states) {
		super();
		this.name = name;
		this.pm = pm;
		this.capital = capital;
		this.states = states;
	}
	public void showOfCountry()
	{
		System.out.println(name);
		System.out.println(pm);
		System.out.println(capital);
		System.out.println(states);
	}
	
	


}
