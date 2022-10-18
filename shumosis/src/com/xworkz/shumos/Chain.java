package com.xworkz.shumos;

public class Chain {
	public String type ;
	public double price ;
	public int  length ;
	public String material ;
	public int weight ;
	public String stolen ;
	public String usedFor ;
	public char fresh ;
	

	public Chain(String type) 

	{
		super();
		this.type=type;
		
	}
	public Chain(String type ,double price) 
	{
		this(type);
		this.price = price;

	}
	public Chain(double price,int length) 
	{
		this("circal",price);
		this.length = length;

	}
	public Chain(int length,String material) 
	{
		this(length,100);
		this.material = material;

	}
	public Chain(String stolen,int weight,String material) 
	{
		this(9,material);
		this.weight = weight;
		this.stolen=stolen;

	}
	public Chain(int Weight,String stolen ,String usedFor) 
	{
		this(stolen,9,"gold");
		this.usedFor = usedFor;

	}
	public Chain(int weight,String stolen ,String usedFor,char fresh) 
	{
		this(weight,stolen,usedFor);
		this.usedFor = usedFor;
		this.fresh=fresh;

	}

}
