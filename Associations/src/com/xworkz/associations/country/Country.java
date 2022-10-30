package com.xworkz.associations.country;

public class Country {

	public String name;
	public City[] cities;
	public President  president;
	
	public Country(String name,President  president,City[] cities)
	{
		this.name=name;
		this.president=president;
		this.cities=cities;
	}
	
	public void showToShumos()
	{
		System.out.println(this.name);
		if(president==null) {
			System.out.println("president is null");
		}
		else 
		{
			System.out.println(this.president);
		}
		
		if(cities !=null && cities.length>0) 
		{
		        for (int i = 0; i < cities.length; i++) 
		             {
			             City element = this.cities[i];
			            System.out.println(element);
			                     if(element== null) 
			                     {
			                       System.out.println("city is null");
			                     }
		             }
	    }
	
	
	}	
}
