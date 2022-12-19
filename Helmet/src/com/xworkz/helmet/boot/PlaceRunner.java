package com.xworkz.helmet.boot;

import com.xworkz.helmet.dto.PlaceDto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;
import com.xworkz.helmet.repository.PlaceRepo;
import com.xworkz.helmet.repository.PlaceRepoImpl;
import com.xworkz.helmet.service.PlaceService;
import com.xworkz.helmet.service.PlaceServiceImpl;

public class PlaceRunner {

	public static void main(String[] args) {
		
		
		PlaceDto placeDto = new PlaceDto("nandi hilla","bengaluru","skies", true);
		
		PlaceRepo placeRepo = new PlaceRepoImpl();
		
		PlaceService placeservice = new PlaceServiceImpl(placeRepo);
		
		try {
			placeservice.validateAndSave(placeDto);
		} catch (somethingIsNotGoodException e) {
		
			e.printStackTrace();
		}

	}

}
