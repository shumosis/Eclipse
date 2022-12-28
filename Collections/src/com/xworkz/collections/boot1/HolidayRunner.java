package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dtos.AirportDTO;
import com.xworkz.collections.dtos.HolidayDTO;

public class HolidayRunner {

	public static void main(String[] args) {
		
		
		HolidayDTO holidayDTO = new HolidayDTO("diwali", 4,22);
   
		HolidayDTO holidayDTO1 = new HolidayDTO("diwali", 4,22);
		
boolean equals= holidayDTO1.equals(holidayDTO) ;
		
		System.out.println(equals);
		
		Collection<HolidayDTO> holiday = new ArrayList<HolidayDTO>();
		
		holiday.add(holidayDTO1);
		holiday.add(holidayDTO1);
		
		boolean contains = holiday.contains(holidayDTO1);
		System.out.println("contains :"+ true);
				
	}

}
