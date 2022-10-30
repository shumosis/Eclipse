package com.xworkz.associations.country;

public class Name {
	
	public String oldName;
	public String presentName;
	public String futureName;
	
	
	
	public Name(String oldName,String presentName,String futureName)
	
	{
	this.futureName=oldName;
	this.presentName=presentName;
	this.futureName=futureName;
	
	
	System.out.println(oldName);
	System.out.println(presentName);
	System.out.println(futureName);
	}

}
