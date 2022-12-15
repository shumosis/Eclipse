package com.xworkz.helmet.repository;

import com.xworkz.helmet.dto.HelmetDto;

public class HelmetRepoImpl implements HelmetRepo  {
	


	private HelmetDto[] heldto = new HelmetDto[5] ;
	
	
	public int currentIndex=0;

	
	@Override
	public boolean save(HelmetDto dto) {
		System.out.println("running save HelmetDto");
		
		if(this.currentIndex>=this.heldto.length) {
			System.err.println("size s exceeded");
			return false;
		}else {
			
			this.heldto[this.currentIndex]=dto;
			System.out.println("saved" +dto+"in index"+this.currentIndex);
		}

		
		return true;
	}

}
