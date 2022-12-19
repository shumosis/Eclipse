package com.xworkz.helmet.repository;

import com.xworkz.helmet.dto.RailwayStationDto;
import com.xworkz.helmet.exception.IcantEatMoreException;

public class RailwayStationRepoImpl implements RailwayStationRepo {
	
	 RailwayStationDto[]  railwayStationDto = new  RailwayStationDto[5];
     int indexNumber = 0;
	@Override
	public boolean magaThumBko(RailwayStationDto stationDto) {
		
		if(this.indexNumber>=this.railwayStationDto.length) {
			System.out.println("my pet is full ");
			throw new IcantEatMoreException("aur mat bharo bhai");
		}else {
			this.railwayStationDto[this.indexNumber] =stationDto;
			
			System.out.println("station dto is saved"+stationDto+"atindex"+this.indexNumber);
			indexNumber++;
		}
		
		return true;
	}

}
