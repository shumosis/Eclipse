package com.xworkz.association.has_a;

public class City_p {
	
	public String name;
	public boolean capital;
	public String mla;
	public String famousFor;
	
	public City_p(String name, boolean capital, String mla, String famousFor) {
		super();
		this.name = name;
		this.capital = capital;
		this.mla = mla;
		this.famousFor = famousFor;
	
	}
	public void shoeOfCity()
	{
		System.out.println(name);
		System.out.println(capital);
		System.out.println(mla);
		System.out.println(famousFor);
	}
	

}
