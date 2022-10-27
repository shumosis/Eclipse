package com.xworkz.associations.things;

public class Weapon {
	
public String name;
public String use;
public int	weight;


public void showWeapon (String name,String use , int weight) 
{
	this.name=name;
	this.use=use;
	this.weight=weight;
	
	System.out.println(name);
	System.out.println(use);
	System.out.println(weight);
}

}
