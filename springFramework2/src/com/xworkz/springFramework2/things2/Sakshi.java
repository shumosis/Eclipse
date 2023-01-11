package com.xworkz.springFramework2.things2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sakshi {
	@Autowired
	@Qualifier("sakshiType")
	private String type;
	@Autowired
	@Qualifier("surName")
	private String surname;
	@Autowired
	@Qualifier("CityName")
	private String city;
	@Autowired
	@Qualifier("ageOfSakshi")
	private int age ;
	@Autowired
	@Qualifier("goodGirl")
	private boolean goodgirl;
	
	@Override
	public String toString() {
		return "Sakshi [type=" + type + ", surname=" + surname + ", city=" + city + ", age=" + age + ", goodgirl="
				+ goodgirl + "]";
	}
	
	
	

}
