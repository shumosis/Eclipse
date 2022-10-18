package com.xworkz.shumos;

public class Bgmit {
	
	public String priciple_name;
	public double no_of_branches;
	public double no_of_students;
	public double of_teachers;
	public boolean library;
	public boolean canteen;
	public String[] braches;
	public String[] enc_teachers;
	public String[] civil_teachers;
	public String[] mech_teachers;
	public String[] cs_teachers;
	
	public Bgmit(String priciple_name,double no_of_branches,double no_of_students, double of_teachers
			,boolean library,boolean canteen,String[] braches,String[] enc_teachers,
			String[] civil_teachers ,String[] mech_teachers,String[] cs_teachers) 
	{
		
		
	this.priciple_name=priciple_name;
	this.no_of_branches=no_of_branches;
	this.no_of_students=no_of_students;
	this.of_teachers=of_teachers;
	this.library=library;
	this.canteen=canteen;
	this.braches=braches;
	this.enc_teachers=enc_teachers;
	this.civil_teachers=civil_teachers;
	this.mech_teachers=mech_teachers;
	this.cs_teachers=cs_teachers;
		
	System.out.println("clg is just ok");
	}
	public void display() 
	{
		System.out.println(this.priciple_name);
		System.out.println(this.no_of_branches);
		System.out.println(this.no_of_students);
		System.out.println(this.of_teachers);
		System.out.println(this.library);
		System.out.println(this.canteen);
		
		System.out.println(this.braches);
		for(int i=0;i<this.braches.length;i++) {
			String brache=this.braches[i];
			System.out.println(brache);
		}
		
		System.out.println(this.enc_teachers);
        for(int i=0;i<this.enc_teachers.length;i++)
        {
			
			String enc_teacher=this.enc_teachers[i];
			System.out.println(enc_teacher);
		}
        
		System.out.println(this.civil_teachers);
        for(int i=0;i<this.civil_teachers.length;i++)
        {
			
			String civil_teacher=this.civil_teachers[i];
			System.out.println(civil_teacher);
		}
        
		System.out.println(this.cs_teachers);
        for(int i=0;i<this.cs_teachers.length;i++) 
        {
			
			String cs_teacher=this.cs_teachers[i];
			System.out.println(cs_teacher);
		}
        
		System.out.println(this.mech_teachers);
        for(int i=0;i<this.mech_teachers.length;i++) 
        {
			
			String mech_teacher =this.mech_teachers[i];
			System.out.println(mech_teacher);
		}
	}

}
