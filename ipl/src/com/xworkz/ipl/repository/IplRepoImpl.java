package com.xworkz.ipl.repository;

import com.xworkz.ipl.customexception.shubhamException;
import com.xworkz.ipl.dto.IplDTO;

public class IplRepoImpl implements IplRepository {
	
	private IplDTO[] ipldtos = new IplDTO[10];
	private int currentIndex=0;

	@Override
	public boolean create(IplDTO dto) {
		System.out.println("running create of IplDto"+dto);
		if(currentIndex>=this.ipldtos.length) {
			throw new shubhamException();
		}else {
		this.ipldtos[this.currentIndex]=dto;
		System.out.println("saved" + "in index" +this.currentIndex);
		currentIndex++;
		
	}
		return true;
		
	
	}

	@Override
	public int total() {
	
		System.out.println( currentIndex);;
		return currentIndex;
	}

}
