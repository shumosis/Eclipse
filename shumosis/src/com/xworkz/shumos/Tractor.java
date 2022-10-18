package com.xworkz.shumos;

public class Tractor {
	public String name;
	public String brand;
	public double price;
	public String color;
	public int hp;
	public String model;
	
		
	
	public Tractor( String name)
	{
		super();
		this.name=name;
		
	}
	public Tractor( double price,String brand)
	{
		this("Joshi Tractor");
		this.price=price;
		this.brand=brand;
	}
	public Tractor( String color,String brand,double price)
	{
		this(500,brand);
		this.color=color;
	}
	public Tractor( double price ,String color,String brand,int hp)
	{
		this(color,"shumosis",price);
		this.hp=hp;
	}
	public Tractor( String model,int hp,double price,String brand)
	{
		this(price,"black",brand,2100000);
		this.hp=hp;
		
		this.model=model;
	}
	public Tractor( String name ,int hp,double price,String brand,String color,String model)
	{
		this(model,hp,price,brand);
		
			
	}
	
}
