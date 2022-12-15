package com.xworkz.helmet.service;

import com.xworkz.helmet.constant.Color;
import com.xworkz.helmet.constant.HemetType;
import com.xworkz.helmet.dto.HelmetDto;
import com.xworkz.helmet.repository.HelmetRepo;

public class HelmetserviceImpl implements  HelmetService {

	private  HelmetRepo  helmetRepo ;
	
	
	public HelmetserviceImpl(HelmetRepo helmetRepo) {
		super();
		this.helmetRepo = helmetRepo;
	}


	@Override
	public boolean validateAndSave(HelmetDto dto) {
	System.out.println("running validate and save"+dto);
	
	String brand=dto.getBrand();
	
	HemetType type=dto.getType();
	
	Color color = dto.getColor();
	
	Double price=dto.getPrice();
	
	boolean validBrand = false;
	boolean validType = false;
	boolean validColor = false;
	boolean validprice = false;
	
	if(brand !=null && brand.length()>=4 && brand.length() <=20 ) {
		System.out.println("valid helmet brand" + brand);
		validBrand = true;
	}else {
		System.out.println("Invalid  Helmet brand" + brand);
	}

	if (price != null && price >=500 && price <= 10000) {
		System.out.println("valid Helmet price" +price);
		validType = true;
	}else {
		System.err.println("invalid Helmet price" +price);
	}
		
	if (color!=null ) {
		System.out.println("valid Helmet color" +color);
		validType = true;
	}else {
		System.err.println("invalid Helmet color" +color);
	}
	if (validBrand && validType && validprice && validColor) {
		System.out.println("hlmet is valid we can save using repository");
		boolean saved =this.helmetRepo.save(dto);
		
	
		System.out.println("helmet dto is saved"+saved);
		return saved;
	}	
		return true;
	}

}
