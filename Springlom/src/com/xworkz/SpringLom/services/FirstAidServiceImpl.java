package com.xworkz.SpringLom.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.SpringLom.DTO.FirstAidDto;

import com.xworkz.SpringLom.repository.FirstAidRepoo;

@Component
public class FirstAidServiceImpl implements FirstAidService {

	@Autowired
	private Validator validator;
	private FirstAidRepoo aidrepo;
	
	@Autowired
	public FirstAidServiceImpl(FirstAidRepoo aidrepo) {
		this.aidrepo=aidrepo;
		System.out.println("nanu andre firstAidServiceImpl create agateni");
	}
	
	@Override
	public boolean validateAndSaveNaMadteni(FirstAidDto dto) {
		System.out.println("dto" + dto);
		Set<ConstraintViolation<FirstAidDto>> tapgolu = validator.validate(dto);
		
		if(!tapgolu.isEmpty()) {
			System.err.println("nivu tapideri tapu wapkori or go fuckof");
			tapgolu.forEach((tapu)->System.out.println(tapu.getMessage()));
			return false;
		}else {
			System.out.println("nivu yenu tapu madila u r innocent ,have good day");
			boolean saveMadidraaa = this.aidrepo.saveMadaliBro(dto );
			System.out.println("save madidra?"+saveMadidraaa );
		
			return saveMadidraaa ;
		}
		
		
	
	}

}
