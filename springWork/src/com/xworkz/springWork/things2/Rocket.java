package com.xworkz.springWork.things2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Rocket {
	
	@Value("Chandrayana")
	private String name;
	@Value("india")
	private String country;
	@Value("500000000000")
	private Double budget;
	
	
	public Rocket() {
		System.out.println("calling deafault constructor");
	}
	
	
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public Double getBudget() {
		return budget;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	

}
