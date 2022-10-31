package com.xworkz.associations.country;

public class City {
	
	public Name name;
	public String capital;
	public double areainsqmeter;
	
	public City(Name name,String capital,double areainsqmeter) 
	{
		this.name=name;
		this.capital=capital;
		this.areainsqmeter=areainsqmeter;
		
	}
	public void showofCity() 
	{
	System.out.println(name);
	System.out.println(capital);
	System.out.println(areainsqmeter);
	}
}