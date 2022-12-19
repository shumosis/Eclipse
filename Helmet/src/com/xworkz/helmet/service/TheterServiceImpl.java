package com.xworkz.helmet.service;

import com.xworkz.helmet.dto.Theaterdto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;
import com.xworkz.helmet.repository.TheaterRepo;

public class TheterServiceImpl implements TheaterService {
	
	TheaterRepo theaterRepo ;
	

	public TheterServiceImpl(TheaterRepo theaterRepo) {
		this.theaterRepo = theaterRepo;
	}


	@Override
	public boolean validateAndSave(Theaterdto dto) throws somethingIsNotGoodException {
		System.out.println("Running validate and save "+dto);
		String id=dto.getId();
		String brand =dto.getBrand();
		String name = dto.getName();
		double seats =dto.getSeats();
		
		boolean valiId = false;
		boolean validBrand = false;
		boolean validName = false;
		boolean validSeats = false;
		
		if(id != null && id.length() >3 && id.length() <20) {
			System.out.println("the id is valid"+id);
			valiId = true;
		}else {
			System.err.println("id is not valid");
			valiId = false;

		}
		if(brand != null && brand.length() >2 && brand.length()<20) {
			System.out.println("The brand is valid"+brand);
			validBrand = true;
		}else {
			System.err.println("the brand is not valid");
			validBrand = false;
		
		}
		if(name != null && name.length()>2 && name.length()<20) {
			System.out.println("The name is valid"+name);
			validName = true;
			
		}else {
			System.err.println("the name is not valid");
			validName = false;
		
		}
		if(seats != 0 && seats > 50 && seats < 1000) {
			System.out.println("THe seats are valid"+seats);
			validSeats = true;
		}else {
			System.err.println("seats r not valid");
			validSeats = false;
		
		}
		
		
		if(valiId  && validBrand && validName && validSeats ) {
			boolean savejhala = this.theaterRepo.store(dto);
			System.out.println("th data is saved"+savejhala);
		  
		}else {
	  
		System.err.println("i will punch u on your face");
        throw new somethingIsNotGoodException("check the data u entered");
		}	
		
	return true;
	}
}
