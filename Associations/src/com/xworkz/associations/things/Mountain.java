package com.xworkz.associations.things;

public class Mountain {
  
	public String name;
	public Location location;
	public int  height;
	public Temple temple;
	
	
	public void showMountain(String name,Location location,int  height,Temple temple)
	{
		this.name=name;
		this.location=location;
		this.height=height;
		this.temple=temple;
		
		System.out.println(name);
		System.out.println(location);
		System.out.println(height);
	
		
		
	}
}
