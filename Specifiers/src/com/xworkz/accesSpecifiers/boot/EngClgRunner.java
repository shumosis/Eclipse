package com.xworkz.accesSpecifiers.boot;

import com.xworkz.accesSpecifiers.EngClg;
import com.xworkz.accesSpecifiers.EngClggg;

public class EngClgRunner {


		public static void main(String[] args) {
		
			EngClg engClg = new EngClg("mudhol","principle","chirantimath","bagalkot", 50,2012,500,10000, false, false, 4);
			
					 EngClggg  engClggg  =new  EngClggg ();
			
			engClg.getName();
			
		
			 engClggg .useclg( engClg);

	}

}
