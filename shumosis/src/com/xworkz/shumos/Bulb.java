package com.xworkz.shumos;

public class Bulb {
	

	public String name;
	public double voltage;
	public double warrenty ;
	public double MFY;
	public double price;
	public boolean brightLight;
	public String[] color ;
	public String[] shape;
	public String[] sizes;
	public String[] uses;
	public String[] types;
	
	public Bulb(String name,double voltage,double warrenty,double MFY,double price
			,boolean brightLight ,String[] color,String[] shape,String[] sizes, String[] uses,
			String[] types) 
	{
		this.name=name;
		this.voltage=voltage;
		this.warrenty=warrenty;
		this.MFY=MFY;
		this.price=price;
		this.brightLight=brightLight;
		this.color=color;
		this.shape=shape;
		this.sizes=sizes;
		this. uses= uses;
		this.types=types;
		
		System.out.println("i love this bulb");
		
	}
	public void display() 
	{
		System.out.println(this.name);
		System.out.println(this.warrenty);
		System.out.println(this.voltage);
		System.out.println(this.MFY);
		System.out.println(this.brightLight);
		System.out.println(this.price);
		

		System.out.println(this.color);
		for(int i=0;i<this.color.length;i++)
		{
			String col=this.color[i];
			System.out.println(col);
		}
		
		
		System.out.println(this.shape);
		for(int i=0;i<this.shape.length;i++)
		{
			String sha=this.shape[i];
			System.out.println(sha);
		}
		
		
		System.out.println(this.uses);
		for(int i=0;i<this.uses.length;i++)
		{
			String use=this.uses[i];
			System.out.println(use);
		}
		
		
		System.out.println(this.types);
		for(int i=0;i<this.types.length;i++)
		{
			String use=this.types[i];
			System.out.println(use);
		}



	}

	
	
}
