package com.xworkz.SpringFramework3.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Prouducer {
	@Autowired
	 private Assistant assistant;
	@Autowired
	 private Company company;
	 
	 public Prouducer() {
		 System.out.println("running prouducer");
		// System.out.println("Assistant ;"+assistant.hashCode());
		// System.out.println("company :"+company.hashCode());
	 }
	 public void test3() {
		 company.test2();
	 }
	 

}
