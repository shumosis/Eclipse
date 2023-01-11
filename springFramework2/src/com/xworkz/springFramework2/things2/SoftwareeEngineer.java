package com.xworkz.springFramework2.things2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareeEngineer {
	
	@Autowired
	@Qualifier("nameofSoftEng")
	private String name;
	@Autowired
	@Qualifier("experience")
	private int experience;
	@Autowired
	@Qualifier("CompanyName")
	private String company;
	@Autowired
	@Qualifier("salary")
	private int salary;
	
	@Override
	public String toString() {
		return "SoftwareeEngineer [name=" + name + ", experience=" + experience + ", company=" + company + ", salary="
				+ salary + "]";
	}
	
	

}
