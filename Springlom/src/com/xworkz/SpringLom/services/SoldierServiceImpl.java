package com.xworkz.SpringLom.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.SpringLom.DTO.SolderDto;
import com.xworkz.SpringLom.repository.SolderRepo;

public class SoldierServiceImpl implements SoldierService{
		
	private SolderRepo repo;
	
	public  SoldierServiceImpl() {
		System.out.println("createad solder serviceiplementaion");
	}
	

	public void setRepo(SolderRepo repo) {
		this.repo = repo;
	}
   
	@Override
   public boolean validateAndSave(SolderDto dto) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		
		Validator valida=factory.getValidator();
		
		Set<ConstraintViolation<SolderDto>> violations 	= valida.validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("errors in the validation some data is invalid");
			violations.forEach(v->System.out.println(v));
			return false;
		}
		else {
			System.out.println("data is valid");
			boolean save = repo.save(dto);
			
			return true;
		}
		
	}
	
	
	
	

}
