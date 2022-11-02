package com.xworkz.accesSpecifiers.boot;

import com.xworkz.accesSpecifiers.Akshay;
import com.xworkz.accesSpecifiers.Joshi;

public class AkshayRunner {

	public static void main(String[] args)
	{
		Akshay akshay= new Akshay("bgmit","shubham","Aakansha",6,1997, 68,true,true,true,42);
		
		Joshi joshi =new Joshi();
		
		akshay.getTown();
		
	
        joshi.useAkshay(akshay);
        		
	
		
	

	}

	
}
