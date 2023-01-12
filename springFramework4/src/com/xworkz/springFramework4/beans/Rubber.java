package com.xworkz.springFramework2.things2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	
	@Autowired
	@Qualifier("typeOfrubber")
	private String type;
	@Autowired
	@Qualifier("nameofRubber")
	private String name;
	@Autowired
	@Qualifier("nameofColorOfRubber")
	private String color;
	@Autowired
	@Qualifier("sizeOfRubber")
	private String size;
	@Autowired
	@Qualifier(" stolenRubber")
	private boolean stolen;
	@Autowired
	@Qualifier("priceOfRubber")
	private int price;
	@Override
	public String toString() {
		return "Rubber [type=" + type + ", name=" + name + ", color=" + color + ", size=" + size + ", stolen=" + stolen
				+ ", price=" + price + "]";
	}

	
}
