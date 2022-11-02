package com.xworkz.accesSpecifiers.boot;

import com.xworkz.accesSpecifiers.Kazi;
import com.xworkz.accesSpecifiers.Nadeem;

public class NadeemRunner {

	public static void main(String[] args) {
	
		Nadeem nadeem= new Nadeem("bgmit","shubham","hina",6,1999, 68,false,false,true,42);
		
		Kazi kazi =new Kazi();
		
		nadeem.getTown();
		
	
        kazi.useAkshay(nadeem);

	}

}
