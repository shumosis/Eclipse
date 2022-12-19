package com.xworkz.helmet.repository;

import com.xworkz.helmet.dto.PlaceDto;
import com.xworkz.helmet.exception.IcantEatMoreException;

public class PlaceRepoImpl implements PlaceRepo {
	
	PlaceDto[] placesss = new PlaceDto[5];
	
	int index = 0;

	@Override
	public boolean save(PlaceDto place) {
		if(index >= placesss.length) {
			System.out.println("pet bhar gaya");
			throw new IcantEatMoreException("nirvana ");
		}else {
			this.placesss[this.index] =place;
			System.out.println("data is saving"+place);
			}
		return true;
	}
}
	


