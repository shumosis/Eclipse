package com.xworkz.shumos;

public class Paper {
	
	public String name;
	public double length;
	public double width;
	public double height;
	public double price;
	public boolean smooth;
	public String[] color ;
	public String[] shape;
	public String[] sizes;
	public String[] uses;
	public String[] types;
	
	public Paper(String name,double length,double width,double height,double price
			,boolean smooth,String[] color,String[] shape,String[] sizes, String[] uses,
			String[] types) 
	{
		this.name=name;
		this.length=length;
		this. width= width;
		this.height=height;
		this.price=price;
		this. smooth= smooth;
		this.color=color;
		this.shape=shape;
		this.sizes=sizes;
		this. uses= uses;
		this.types=types;
		
		System.out.println("i love this paper");
	}


public void display() 
{
	System.out.println(this.name);
	System.out.println(this. length);
	System.out.println(this.width);
	System.out.println(this.height);
	System.out.println(this.smooth);
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
