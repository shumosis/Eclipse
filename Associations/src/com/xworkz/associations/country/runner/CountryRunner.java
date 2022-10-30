package com.xworkz.associations.country.runner;

import com.xworkz.associations.country.City;
import com.xworkz.associations.country.Country;
import com.xworkz.associations.country.Gender;
import com.xworkz.associations.country.Name;
import com.xworkz.associations.country.President;

public class CountryRunner {

	public static void main(String[] args) {
	
		
		President president =new President();
		
		Name name1=new Name("shubham","arvind","garve");
		City city1=new City(name1,"shirdhon",3657);
		
		Name name2=new Name("akshay","r","joshi");
		City city2=new City(name2,"",5677);
		
	
		
		City[] cities= {city1 ,city2 };
		
		Country country = new Country("japan",president,cities);
		
		country.showToShumos();
		country.president.setPresident("obama", 5, Gender.LGBT);
		
	

	}

}
