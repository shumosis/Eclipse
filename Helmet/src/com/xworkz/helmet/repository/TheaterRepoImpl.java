package com.xworkz.helmet.repository;

import com.xworkz.helmet.dto.Theaterdto;
import com.xworkz.helmet.exception.IcantEatMoreException;

public class TheaterRepoImpl implements TheaterRepo  {
        
	Theaterdto[] thdtos = new Theaterdto[5];
	int currentindex =0;
	
	@Override
	public boolean store(Theaterdto dto) {
		
		if(this.currentindex >=this.thdtos.length) {
			System.out.println("the a is full u cant add more");
			throw new IcantEatMoreException("dkbose");
		}else {
		this.thdtos[this.currentindex]=dto;
		
		System.out.println("dto is saved"+dto+"atindex"+this.currentindex);
		currentindex++;
		return true;
		}
}

}


