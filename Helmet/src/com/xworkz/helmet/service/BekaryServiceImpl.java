package com.xworkz.helmet.service;

import com.xworkz.helmet.dto.BekaryDto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;
import com.xworkz.helmet.repository.BekaryRepo;

public class BekaryServiceImpl implements BekaryService{
	
	BekaryRepo bekaryRepo;

	public BekaryServiceImpl(BekaryRepo bekaryRepo) {
		this.bekaryRepo = bekaryRepo;
	}

	@Override
	public boolean validateAndSave(BekaryDto dto) throws somethingIsNotGoodException {
		String name = dto.getName();
		String owner = dto.getOwner();
		String location = dto.getLocation();
		double contact =dto.getContact();
		String famousFor = dto.getFamousFor();
		
		boolean validName = false;
		boolean validOwner = false;
		boolean validLocation = false;
		boolean validContact= false;
		boolean validFamousFor = false;
		
		if(name!=null && name.length()>2 && name.length()<20) {
			System.out.println("data is valid"+name);
			validName = true;
			}
		if(location !=null && location .length()>2 && location .length()<20) {
			System.out.println("data is valid"+location );
			validLocation  = true;
			}
		if(owner!=null && owner.length()>2 && owner.length()<20) {
			System.out.println("data is valid"+owner);
			validOwner = true;
			}
		if( famousFor !=null &&  famousFor .length()>2 &&  famousFor .length()<20) {
			System.out.println("data is valid"+ famousFor );
			validFamousFor  = true;
			}
		if(contact!=0 ) {
			System.out.println("data is valid"+contact);
			validContact = true;
			}
		if(validName&&validLocation&&validOwner&&validFamousFor&&validContact) {
			boolean saving = this.bekaryRepo.Save(dto);
			System.out.println("data is saved"+saving);
		}else {
			  
			System.err.println("i will punch u on your face");
	        throw new somethingIsNotGoodException("check the data u entered");
			}
			
			
			return true;
	
		
	}

}
