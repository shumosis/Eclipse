package com.xworkz.SpringLom.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.SpringLom.DTO.MissileDto;
import com.xworkz.SpringLom.DTO.ResortDto;
import com.xworkz.SpringLom.repository.MIssileRepo;
import com.xworkz.SpringLom.repository.ResortRepo;

@Component
public class MissileserviceImpl implements MissileService {
	
	@Autowired
	private Validator validator;
	private MIssileRepo miisileRepo;
	
	@Autowired
	public MissileserviceImpl( MIssileRepo miisileRepo) {
		this.miisileRepo=miisileRepo;
		System.out.println("nanu andre MissilleServiceImpl create agateni");
	}
	
	@Override
	public boolean validateAndSaveNaMadteni(MissileDto dto) {
		System.out.println("dto" + dto);
		Set<ConstraintViolation<MissileDto>> tapgolu = validator.validate(dto);
		
		if(!tapgolu.isEmpty()) {
			System.err.println("nivu tapideri tapu wapkori or go fuckof");
			tapgolu.forEach((tapu)->System.out.println(tapu.getMessage()));
			return false;
		}else {
			System.out.println("nivu yenu tapu madila u r innocent ,have good day");
			boolean saveMadidraaa = this.miisileRepo.saveMadaliBro(dto );
			System.out.println("save madidra?"+saveMadidraaa );
		
			return saveMadidraaa ;
		}
		
		
	
	}

}
