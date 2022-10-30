package com.xworkz.associations.country;

public class President {
	
	public String name;
	public int tenure;
	public Gender gender;
	
	public void setPresident(String name, int tenure,Gender gender) 
	{
	
		this.name=name;
		this.tenure=tenure;
		this.gender=gender;
		
		System.out.println(name);
		System.out.println(tenure);
		System.out.println(Gender.LGBT);
		
	}

}
