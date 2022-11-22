package com.xworkz.equals.boot;

import com.xworkz.equals.things.Currency;
import com.xworkz.equals.things.God;
import com.xworkz.equals.things.Hospital;
import com.xworkz.equals.things.Institution;
import com.xworkz.equals.things.Lipstick;
import com.xworkz.equals.things.Paint;
import com.xworkz.equals.things.Vehicle;
import com.xworkz.equals.things.WaterBottle;

public class paintRunner {

	public static void main(String[] args) {
		
		
		Paint paint = new Paint("asianpaints","green","shubham","royale",1000,1,750,"home",true,true);
		
		Paint paint1 = new Paint("nerolac","green","shumosis","altima",2000,1,670,"shop",true,true);
		
		boolean samepaint = paint.equals(paint1);
		System.out.println(samepaint);
		
		System.out.println("=========================================");
		
		Vehicle vehicle = new Vehicle("350","enfield","black","shumosis",250000,150,"kolhapur","my enfield","5",true);
		
		Vehicle vehicle1 =  new Vehicle("350","enfield","red","shubham",240000,160,"mudhol","my royle","8",true);
		
		boolean samevehicle = vehicle.equals(vehicle1);
		System.out.println(samevehicle );
		
		System.out.println("=========================================");
		
		WaterBottle waterBottle=new WaterBottle("steel","green","melton","shubham","water","cylinder",1,40,"petrol","more");
		
		WaterBottle waterBottle1=new WaterBottle("steel","green","melton","akshay","petrol","cylinder",4,30,"rovkel","reliance");
		
		boolean samewaterBottle = waterBottle.equals(waterBottle1);
		System.out.println(samewaterBottle );
		
		
		System.out.println("=========================================");

		 Currency  currency = new Currency("rupee","green","india",10,3,1000,"paper","shubham") ;
		 
		 Currency  currency1 = new Currency("rupee","green","india",8,6,4,"paper","shubham") ; 
		 
		 boolean sameCurrency =  currency.equals( currency1);
		System.out.println(sameCurrency);
			
    	System.out.println("=========================================");
    	
    	God god = new God("mahadev","tandav","trishul","parvati","ganesh","kailas","ganja",10,7);
    	
    	God god1 = new God("mahadev","tandav","trishul","parvati","ganesh","himalaya","ganja",8,9);
    	
    	 boolean samegod =  god.equals( god1);
 		System.out.println(samegod);
 		
 		System.out.println("=========================================");
    	
 		Institution Institution = new Institution("bkclg","chickodi","kle's","prabhakar","private",true,1980,7651,300,"bba");
 		
 		Institution Institution1 = new Institution("bkclg","chickodi","kle's","prabhakar","private",true,1970 ,5000,400,"bca");
    	
 		 boolean sameInstitution =  Institution.equals( Institution1);
  		System.out.println(sameInstitution);
  		
  		System.out.println("=========================================");
  		
  		Hospital Hospital= new Hospital("sai","pune","private","rm vaghmare","cancer","shumosis",true,1998,560,638);
  		
  		Hospital Hospital1= new Hospital("sai","pune","private","rm vaghmare","cancer","shumosis",true,1877,370,250);
    	
  		boolean sameHospital=  Hospital.equals( Hospital1);
  		System.out.println(sameHospital);
    	
		 
  		System.out.println("========================================="); 
  		
  	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
