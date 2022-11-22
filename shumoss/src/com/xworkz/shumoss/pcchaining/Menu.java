package com.xworkz.shumoss.pcchaining;

public class Menu extends Catering  {

	public String cateringFor;
 	public String name;
	public Menu(String cateringFor, String cateringCompany, String cateringCompanyOwner,String name) {
		super(cateringFor, cateringCompany, cateringCompanyOwner);
		this.cateringFor=cateringFor;
		this.name=name;
		
	}
	
	

}
