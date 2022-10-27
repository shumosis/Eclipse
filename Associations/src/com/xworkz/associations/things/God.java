package com.xworkz.associations.things;

public class God {
	
	public String name;
	public String gender;
	public Weapon weapon ;
	public String mainpower;
	
	
	public void showgod(String name,String gender,Weapon weapon ,String mainpower) 
	{
		this.name=name;
		this.gender=gender;
		this.weapon=weapon;
		this.mainpower=mainpower;
				
		System.out.println(name);
		System.out.println(gender);
	
		System.out.println(mainpower);
		
	}

}
