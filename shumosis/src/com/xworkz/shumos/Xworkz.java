package com.xworkz.shumos;
 import com.xworkz.shumos.Cources;
public class Xworkz {
	
	public String ownername;
	public int teachers;
	public int students;
	public String area;
	public Cources cources=Cources.JAVA;
	
	public Xworkz(String ownername,int teachers,int students,String area,Cources cources) 
	{
		this.ownername=ownername;
		this. teachers=teachers;
		this.students=students;
		this.area=area;
		this.cources=cources;
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * public void Xwo(String ownername,int teachers,int students,String
	 * area,Cources cources) { this.ownername=ownername; this. teachers=teachers;
	 * this.students=students; this.area=area; this.cources=cources; }
	 */
	public void display() {
		System.out.println(this.ownername);
		System.out.println(this.teachers);
		System.out.println(this.students);
		System.out.println(this.area);
		System.out.println(this.cources);
	}
	

}
