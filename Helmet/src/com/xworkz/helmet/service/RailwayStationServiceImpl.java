package com.xworkz.helmet.service;

import com.xworkz.helmet.dto.RailwayStationDto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;
import com.xworkz.helmet.repository.RailwayStationRepo;
import com.xworkz.helmet.repository.RailwayStationRepoImpl;

public class RailwayStationServiceImpl implements RailwayStationService {
     
	RailwayStationRepo railwayStationRepo ;
	
	
	   
	public RailwayStationServiceImpl(RailwayStationRepo railwayStationRepo) {
		this.railwayStationRepo = railwayStationRepo;
	}



	@Override
	public boolean validateAndSave(RailwayStationDto stationDto) throws somethingIsNotGoodException {
		
		String name = stationDto.getName();
		String area = stationDto.getArea();
		int noOfPlatforms = stationDto.getNoOfPlatforms();
		int platformTicket = stationDto.getPlatformsTicket();
		
		boolean validName;
		boolean validarea;
		boolean validNoOfPlatforms;
		boolean validPlatformTicket;
		
		if(name!=null && name.length()>4 && name.length()<20) {
			System.out.println("name is valid  "+name);
			validName=true;
			}else {
				System.err.println("name is not valid  "+name);
				validName= false;
			}
		
		if(area!=null && area.length()>4 && area.length()<20) {
			System.out.println("area is valid  "+area);
			validarea=true;
			}else {
				System.err.println("area is not valid  "+area);
				validarea = false;
			}
		if(noOfPlatforms !=0 && noOfPlatforms <50) {
			System.out.println("noOfPlatforms  is valid  "+noOfPlatforms );
			validNoOfPlatforms=true;
			}else {
				System.err.println("noOfPlatforms  is not valid  "+noOfPlatforms );
           validNoOfPlatforms = false;
			}
		if( platformTicket !=0 &&  platformTicket <50) {
			System.out.println(" platformTicket  is valid  "+ platformTicket );
			validPlatformTicket=true;
			}else {
				System.err.println(" platformTicket is not valid  "+ platformTicket );
				validPlatformTicket = false;
			}
		if(validName && validarea && validNoOfPlatforms &&validPlatformTicket) {
			boolean savekara =this.railwayStationRepo.magaThumBko(stationDto);
			System.out.println("railway data is saved"+savekara);
			  
		}else {
	  
		System.err.println("i will punch u on your face");
        throw new somethingIsNotGoodException("check the data u entered");
		}
		
		
		return true;
	}

}
