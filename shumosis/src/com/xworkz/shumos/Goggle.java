package com.xworkz.shumos;

public class Goggle {
	

	public String ownerName;
	public String company;
	public double warrenty ;
	public double MFY;
	public double price;
	public boolean experienceGood;
	public String[] color ;
	public String[] shape;
	public String[] sizes;
	public String[] uses;
	public String[] types;
	
	public Goggle(String  ownerName,String company,double warrenty,double MFY,double price
			,boolean  experienceGood,String[] color,String[] shape,String[] sizes, String[] uses,
			String[] types)
	{

		this.ownerName=ownerName;
		this.company= company;
		this.warrenty=warrenty;
		this.MFY=MFY;
		this.price=price;
		this.experienceGood=experienceGood;
		this.color=color;
		this.shape=shape;
		this.sizes=sizes;
		this. uses= uses;
		this.types=types;
		
		System.out.println("i love this goggle");
	}
	public void display() 
	{
		System.out.println(this.ownerName);
		System.out.println(this.warrenty);
		System.out.println(this.company);
		System.out.println(this.MFY);
		System.out.println(this.experienceGood);
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
