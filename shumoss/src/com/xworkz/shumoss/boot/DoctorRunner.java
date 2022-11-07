package com.xworkz.shumoss.boot;

import com.xworkz.shumoss.pc.*;


public class DoctorRunner {
	
	public static void main(String[] shumos) {
		
		
		
	Doctor doctor1=new Ent();
	Ent ent = (Ent) doctor1;
	
	System.out.println(ent.entFees);
	System.out.println(ent.entSpecialFor);
	System.out.println(ent.hospitalName);
	System.out.println(ent.name);
		
		Doctor doctor2=new Dentist(); 	
		Dentist dentist =(Dentist) doctor2;
	
	System.out.println(dentist.denSpecialFor);
	System.out.println(dentist.dentistfees);
	
	Doctor doctor3=new Cardiologist();
	Cardiologist cardiologist=(Cardiologist)doctor3;
	
	 System.out.println(cardiologist.cardiologistfees);
	 System.out.println(cardiologist.SpecialFor);
	
	
	}	

}
