package com.xworkz.springFramework2.things2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("typeOfPencil")
	private String type;
	@Autowired
	@Qualifier(" nameofPencil")
	private String name;
	@Autowired
	@Qualifier("nameofColor")
	private String color;
	@Autowired
	@Qualifier("Sharp")
	private boolean sharp;
	@Autowired
	@Qualifier("stolen")
	private boolean stolen;
	@Autowired
	@Qualifier("priceOfPencil")
	private int price;
	@Override
	public String toString() {
		return "Pencil [type=" + type + ", name=" + name + ", color=" + color + ", sharp=" + sharp + ", stolen="
				+ stolen + ", price=" + price + "]";
	}
	
	

}
