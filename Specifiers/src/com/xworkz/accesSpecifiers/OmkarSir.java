package com.xworkz.accesSpecifiers;

public class OmkarSir
{
	private String name ="om" ;
	String job;
	String friend;
	boolean gf;
	double salary;
	int birthYear;
	String partTimeJob;
	boolean drink;
	boolean smoke;
	boolean cute;
	boolean goodTeacher;
	
	public OmkarSir(String job, String friend, boolean gf, double salary, int birthYear, String partTimeJob,
			boolean drink, boolean smoke, boolean cute, boolean goodTeacher) {
		super();
		this.job = job;
		this.friend = friend;
		this.gf = gf;
		this.salary = salary;
		this.birthYear = birthYear;
		this.partTimeJob = partTimeJob;
		this.drink = drink;
		this.smoke = smoke;
		this.cute = cute;
		this.goodTeacher = goodTeacher;
	}
	public String getjob() 
	 {
		return this.job=job;
	 }
	 void setJob(String job) 
	 {
		this.job=job; 
	 }

}
