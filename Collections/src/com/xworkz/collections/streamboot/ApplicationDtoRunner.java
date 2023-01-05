package com.xworkz.collections.streamboot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.streamDto.ApplicationDto;

public class ApplicationDtoRunner {

	public static void main(String[] args) {
		
		Collection<ApplicationDto> applications = new ArrayList<ApplicationDto>();

		applications.add(new ApplicationDto("ola",123456, false,"shumosis",500));
		applications.add(new ApplicationDto("uber",23456, false,"Akshay",600));
		applications.add(new ApplicationDto("oyo",34567, false,"natu",700));
		applications.add(new ApplicationDto("facebook",45678, false,"google",800));
		applications.add(new ApplicationDto("instagram",56789, false,"google",900));
		applications.add(new ApplicationDto("tinder",67890, false,"manu",200));
		
		applications.stream().filter()
	}

}
