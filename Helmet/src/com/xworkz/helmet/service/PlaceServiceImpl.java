package com.xworkz.helmet.service;

import com.xworkz.helmet.dto.PlaceDto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;
import com.xworkz.helmet.repository.PlaceRepo;

public class PlaceServiceImpl implements PlaceService {
	
	PlaceRepo placeRepo;
	
	public PlaceServiceImpl(PlaceRepo placeRepo) {
		this.placeRepo = placeRepo;
	}

    @Override
	public boolean validateAndSave(PlaceDto place) throws somethingIsNotGoodException {
		
		String name = place.getName();
		String location = place.getName();
		String famousFor = place.getFamousFor();
		boolean good = place.isGood();
		
		boolean validName = false;
		boolean validLocation = false;
		boolean validFamousFor = false;
		boolean validgood = false;
		
		if(name != null && name.length()>2 && name.length()<30) {
			System.out.println("data is valid"+name);
			validName = true;
		}
		if(location != null && location.length()>2 && location.length()<30) {
			System.out.println("data is valid"+location);
			validName = true;
		}
		if( famousFor != null &&  famousFor.length()>2 &&  famousFor.length()<30) {
			System.out.println("data is valid"+ famousFor);
			validName = true;
		}
	
		
		if(good != false ) {
			System.out.println("data is valid"+good);
			validName = true;
		}
		if(validgood &&  validFamousFor&& validLocation && validName ) {
		 boolean saved = this.placeRepo.save(place);
		 System.out.println("plac data is saved"+saved);
		}else {
			System.out.println("data is not valid");
			throw new somethingIsNotGoodException("i want to punch on your face");
		}
		return true;
    }

}
