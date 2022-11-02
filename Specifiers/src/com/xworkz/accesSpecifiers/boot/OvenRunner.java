package com.xworkz.accesSpecifiers.boot;

import com.xworkz.accesSpecifiers.Oven;
import com.xworkz.accesSpecifiers.Ovennn;


public class OvenRunner {

	public static void main(String[] args) {
		
		 Oven  oven = new  Oven("lg","gray","cooking",2,25,2,50,20000, false, false) ;
		
		 oven.getOwner();
		
		 Ovennn Ovennn = new  Ovennn();
		 
		 Ovennn.useMachine( oven);
		

	}

}
