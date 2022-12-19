package com.xworkz.helmet.boot;

import com.xworkz.helmet.dto.Theaterdto;
import com.xworkz.helmet.exception.somethingIsNotGoodException;
import com.xworkz.helmet.repository.TheaterRepo;
import com.xworkz.helmet.repository.TheaterRepoImpl;
import com.xworkz.helmet.service.TheaterService;
import com.xworkz.helmet.service.TheterServiceImpl;

public class TheaterRunner {

	public static void main(String[] args) {
		
		Theaterdto theaterdto = new Theaterdto("navrang","nav1234","pvr",150);
		Theaterdto theaterdto1 = new Theaterdto("orion","nav1234","pvr",150);
		Theaterdto theaterdto2 = new Theaterdto("gopalan","nav1234","pvr",150);
		Theaterdto theaterdto3 = new Theaterdto(null,"nav1234","pvr",150);
		Theaterdto theaterdto4 = new Theaterdto("inox","nav1234","pvr",150);
		Theaterdto theaterdto5 = new Theaterdto("ix","nav1234","pvr",150);
	
		TheaterRepo theaterRepo = new TheaterRepoImpl();
		
		TheaterService theaterService = new TheterServiceImpl(theaterRepo);

		System.out.println("==========================");
		try {
			theaterService.validateAndSave(theaterdto);
		} catch (somethingIsNotGoodException e) {
			
			e.printStackTrace();
			
			
		}
		System.out.println("==========================");
		try {
			theaterService.validateAndSave(theaterdto1);
		} catch (somethingIsNotGoodException e) {
			
			e.printStackTrace();
			
		}
		System.out.println("================================");
		try {
			theaterService.validateAndSave(theaterdto2);
		} catch (somethingIsNotGoodException e) {
			
			e.printStackTrace();
		}
		System.out.println("==================================");
		try {
			theaterService.validateAndSave(theaterdto3);
		} catch (somethingIsNotGoodException e) {
			
			e.printStackTrace();
		}
		System.out.println("===============================");
		try {
			theaterService.validateAndSave(theaterdto4);
		} catch (somethingIsNotGoodException e) {
			
			e.printStackTrace();
		}
		System.out.println("=================================");
		try {
			theaterService.validateAndSave(theaterdto5);
		} catch (somethingIsNotGoodException e) {
		
			e.printStackTrace();
		}
		System.out.println("=================================");
		
		
		
		System.out.println("***************&&&&&&&&&&&&&&*******************");
		Theaterdto theaterdto00 = new Theaterdto("nita","nav1234","pvr",150);
		Theaterdto theaterdto11 = new Theaterdto("lulu","nav1234","pvr",150);
		Theaterdto theaterdto22 = new Theaterdto("gova","nav1234","pvr",150);
		Theaterdto theaterdto33 = new Theaterdto(null,"nav1234","pvr",150);
		Theaterdto theaterdto44 = new Theaterdto("inggh","nav1234","pvr",150);
		Theaterdto theaterdto55 = new Theaterdto("ix","nav1234","pvr",150);
		Theaterdto theaterdto66 = new Theaterdto("amravati","nav1234","pvr",150);
		Theaterdto theaterdto77 = new Theaterdto("kore","nav1234","pvr",150);
            
		TheaterRepo theaterRepo2 = new TheaterRepoImpl();
		
		TheaterService theaterService2 = new TheterServiceImpl(theaterRepo2);
		try {
			theaterService2.validateAndSave(theaterdto77);
		} catch (somethingIsNotGoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		try {
			theaterService2.validateAndSave(theaterdto66);
		} catch (somethingIsNotGoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		try {
			theaterService2.validateAndSave(theaterdto55);
		} catch (somethingIsNotGoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		try {
			theaterService2.validateAndSave(theaterdto44);
		} catch (somethingIsNotGoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		try {
			theaterService2.validateAndSave(theaterdto33);
		} catch (somethingIsNotGoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		try {
			theaterService2.validateAndSave(theaterdto22);
		} catch (somethingIsNotGoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		try {
			theaterService2.validateAndSave(theaterdto11);
		} catch (somethingIsNotGoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		try {
			theaterService2.validateAndSave(theaterdto00);
		} catch (somethingIsNotGoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
	}

}
