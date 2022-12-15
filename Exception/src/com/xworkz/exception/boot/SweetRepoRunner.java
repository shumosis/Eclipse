package com.xworkz.exception.boot;

import com.xworkz.exception.task.SweetNameRepo;
import com.xworkz.exception.task.SweetRepoImpl;

public class SweetRepoRunner {

	public static void main(String[] args) {
		
		SweetNameRepo nameRepository=new SweetRepoImpl();
		nameRepository.prepare("kaju katali");
		nameRepository.prepare("kashmirPak");
		nameRepository.prepare("chandrapak");
		nameRepository.prepare("kesaribath");
		nameRepository.prepare("laddu");
		nameRepository.prepare("besan ladoo");
		nameRepository.prepare("rasgulla");
		nameRepository.prepare("malai");
		nameRepository.prepare("binduladdus");
		nameRepository.prepare("modak");
		//nameRepository.prepare("tea");
		System.out.println(nameRepository.totalSweets());
		

	}

}
