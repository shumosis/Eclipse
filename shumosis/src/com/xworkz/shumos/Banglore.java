package com.xworkz.shumos;

public class Banglore 
{
	public String name;
	public double area;
	public double mlas;
	public double noOfMalls;
	public double metros;
	public boolean nice;
	public String[] mainArea ;
	public String[] itArea;
	public String[] institutes;
	public String[] temples;
	public String[] xworkz;
	
	public Banglore(String name, double area, double mlas, double noOfMalls, double metros,
			boolean nice , String[] itArea,String[] institutes,String[] temples,String[] xworkz,
			String[] mainArea) 
	{
		this.name=name;
		this.area=area;
		this.mlas= mlas;
		this.noOfMalls=noOfMalls;
		this. metros= metros;
		this.nice=nice;
		this.mainArea=mainArea;
		this.itArea=itArea;
		this.institutes=institutes;
		this.temples=temples;
		this.xworkz= xworkz;
		
		System.out.println("i love this banglore");	
	}
	
	public void display() 
	{
		System.out.println(this.name);
		System.out.println(this.area);
		System.out.println(this.mlas);
		System.out.println(this.noOfMalls);
		System.out.println(this.metros);
		System.out.println(this.nice);
		

		System.out.println(this.mainArea);
		for(int i=0;i<this.mainArea.length;i++)
		{
			String col=this.mainArea[i];
			System.out.println(col);
		}
		
		
		System.out.println(this.itArea);
		for(int i=0;i<this.itArea.length;i++)
		{
			String sha=this.itArea[i];
			System.out.println(sha);
		}
		
		
		System.out.println(this.institutes);
		for(int i=0;i<this.institutes.length;i++)
		{
			String use=this.institutes[i];
			System.out.println(use);
		}
		
		
		System.out.println(this.temples);
		for(int i=0;i<this.temples.length;i++)
		{
			String use=this.temples[i];
			System.out.println(use);
		}
		
		System.out.println(this. xworkz);
		for(int i=0;i<this. xworkz.length;i++)
		{
			String use=this. xworkz[i];
			System.out.println(use);
		}


	}
}
