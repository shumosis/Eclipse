package com.xworkz.association.has_a;

public class Email {
	
	
	public String id;
	public String password;
	public double mobile_no;
	public Company company;
	
	public Email(String id, String password, double mobile_no, Company company) {
		
		this.id = id;
		this.password = password;
		this.mobile_no = mobile_no;
		this.company = company;
	}
	public void show() {

		System.out.println(id);
		System.out.println(password);
		System.out.println(mobile_no);
		company.showofcompany();
	}
	
	

}
