package com.xworkz.interviewPrograms;

import java.util.HashMap;

public class OccuranceOfchar {
	
	 public static void main(String[] args) {
	      String str = "SSDRRRTTYYTYTR";
	      HashMap <Character, Integer> hMap = new HashMap<>();
	      for (int i = str.length() - 1; i >= 0; i--) {
	         if (hMap.containsKey(str.charAt(i))) {
	            int val = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), ++val);
	         } else {
	            hMap.put(str.charAt(i),1);
	         }
	      }
	      System.out.println(hMap);
	      hMap.forEach((c1,e1)->System.out.println(c1+" : "+e1));

	   }
	
	

}
