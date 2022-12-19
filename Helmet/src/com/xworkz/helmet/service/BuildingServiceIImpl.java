package com.xworkz.helmet.service;

import com.xworkz.helmet.dto.BuildingDto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;
import com.xworkz.helmet.repository.BuildingRepo;

public class BuildingServiceIImpl implements  BuildingService{
	
	BuildingRepo buildingRepo;
	
	public BuildingServiceIImpl(BuildingRepo buildingRepo) {
		this.buildingRepo = buildingRepo;
	}

	@Override
	public boolean validateAndSave(BuildingDto dto) throws somethingIsNotGoodException {
		
		int no = dto.getNo();
		String name = dto.getName();
		String type = dto.getType();
		boolean parking = dto.isParking();
		boolean lift = dto.isLift();
		int floors =dto.getFloors();
		
		boolean validNo=false;
		boolean validName = false;
		boolean validType = false;
		boolean validParking = false;
		boolean validLift = false;
		boolean validFloors =false;
		
		if(no != 0) {
			System.out.println("data is valid  "+no);
			validNo = true;
		}else {
			System.err.println("data is not valid"+no);
			validNo = false;
		}
		
		if(name != null && name.length()>2 && name.length()<20) {
			System.out.println("data is valid  "+name);
			validName = true;
		}else {
			System.err.println("data is not valid"+name);
			validName = false;
		}
		if(type != null && type.length()>2 && type.length()<20) {
			System.out.println("data is valid  "+type);
			validType = true;
		}else {
			System.err.println("data is not valid"+type);
			validType = false;
		}
		
		
		if(parking = true ) {
			System.out.println("data is valid  " +parking);
			validParking = true;
		}else {
			System.err.println("data is not valid");
			validParking = false;
		}
		
		

		if(lift = true ) {
			System.out.println("data is valid  " +lift);
			validLift = true;
		}else {
			System.err.println("data is not valid");
			validLift = false;
		}
		
		
		
		if(floors != 0 ) {
			System.out.println("data is valid  " +floors);
			validFloors = true;
		}else {
			System.err.println("data is not valid");
			validFloors= false;
		}
		
		if(validFloors && validLift && validParking && validType && validName && 	validNo) {
			
			boolean succesInLife = this.buildingRepo.store(dto);
			System.out.println("th data is saved"+succesInLife);
			  
			}else {
		  
			System.err.println("i will punch u on your face");
	        throw new somethingIsNotGoodException("check the data u entered dk");
			}	
			 return true;
	}

}
