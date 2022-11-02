package com.xworkz.association.has_a_runner;

import com.xworkz.association.has_a.*;

public class Personrunner {

	public static void main(String[] args) {
		
		
		
		City_p city1 = new City_p("bengaluru",true,"shubham","IT");
		 State state1=new State("karnataka","bommai","bjp", 47);
	     Country country1 = new Country("india","deelhi","modi",37);
		Location location1 = new Location("chord",city1,state1,country1);
		Address address1 =new Address(location1);
		Company company1 =new Company("shumosis","shubham",address1);
		Email email1 =new Email("sssss","12345678",8867114,company1);
		System.out.println("=========================================");
		City_p city2 = new City_p("mumbai",true,"gggg","beach");
		 State state2=new State("kerala","swami","bjp", 47);
	     Country country2 = new Country("england","newyork","rishi",37);
		Location location2 = new Location("mgroad",city2,state2,country2);
		Address address2 =new Address(location2);
		Company company2 =new Company("vinoda","shubham",address2);
		Email email2 =new Email("ggggggg","12345678",8867114,company2);
		System.out.println("============================================");
		
		Email[] email = {email1 ,email2};
		
		Job job = new Job(20000,"lead",true,company1);
		
		
	    person person = new person("akshay",email,job);
	    person.showOfPerson();
		person.job.showofjob();
		person.job.company.showofcompany();
		person.job.company.addres.location.city.shoeOfCity();
	person.job.company.addres.location.country.showOfCountry();
	    person.job.company.addres.location.state.showOfStates();
		 

	}

}
