package com.xworkz.map.boot2;

import java.util.Map;
import java.util.TreeMap;

public class MobilePhoneDetailsRunner {
	
	public static void main(String[] args) {
		
		Map<String,Double> details= new TreeMap<String, Double>((e1,e2)->e2.compareTo(e1));
		
		 details.put("realme",10000D);
		 details.put("vivo", 12000D);
		 details.put("Oppo",11000D);
		 details.put("moto",13000D);
		 details.put("nokia",14000D);
		 details.put("micromax",70000d);
		 details.put("poco",18000d);
		 details.put("oneplus",24000d);
		 details.put("samsung",26000d);
		 details.put("iphone",80000d);
		 
		 details.forEach((e1,e2)->System.out.println("keya :"+e1+"  value :"+e2));
		 System.out.println("==============");
		
		 details.forEach((e1,e2)->System.out.println("key  :"+e1.toUpperCase()+"  value :" +e2));
		 System.out.println("============");
		 details.forEach((e1,e2)->{if(e2>10000D) {System.out.println("key :"+e1+"  value :"+e2);
		 }});
		 
		 System.out.println("===================");
		 
		 }

		 

}
