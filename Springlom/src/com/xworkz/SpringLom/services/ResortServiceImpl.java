package com.xworkz.SpringLom.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.SpringLom.DTO.ResortDto;
import com.xworkz.SpringLom.repository.ResortRepo;
@Component
public class ResortServiceImpl implements ResortService {
	@Autowired
	private Validator validator;
	private ResortRepo resortRoom;
	
	@Autowired
	public ResortServiceImpl(ResortRepo resortRoom) {
		this.resortRoom=resortRoom;
		System.out.println("nanu andre ResortServiceImpl create agateni");
	}
	
	@Override
	public boolean validateAndSaveNaMadteni(ResortDto dto) {
		System.out.println("dto" + dto);
		Set<ConstraintViolation<ResortDto>> tapgolu = validator.validate(dto);
		
		if(!tapgolu.isEmpty()) {
			System.err.println("nivu tapideri tapu wapkori or go fuckof");
			tapgolu.forEach((tapu)->System.out.println(tapu.getMessage()));
			return false;
		}else {
			System.out.println("nivu yenu tapu madila u r innocent ,have good day");
			boolean saveMadidraaa = this.resortRoom.saveMadaliBro(dto );
			System.out.println("save madidra?"+saveMadidraaa );
		
			return saveMadidraaa ;
		}
		
		
	
	}

}
