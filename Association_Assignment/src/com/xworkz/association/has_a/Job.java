package com.xworkz.association.has_a;

public class Job {
	
	public Address address;
	
	public double  salary;
	public String role;
	public boolean bond ;
	//public Company company =new Company("shumosis","shubham garve",address);
	public Company company;
	
	public Job(double salary, String role, boolean bond, Company company) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
		this.company = company;
	}
	public void showofjob() 
	{
		System.out.println(salary);
		System.out.println(role);
		System.out.println(bond);
	    
		company.showofcompany();
	}

}
