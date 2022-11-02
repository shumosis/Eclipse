package com.xworkz.accesSpecifiers.boot;

import com.xworkz.accesSpecifiers.Odc;
import com.xworkz.accesSpecifiers.OmkarSir;

public class OmkarSirRunner {

	public static void main(String[] args) 
	{
	 
		OmkarSir omkarsir = new OmkarSir("developer","tiger",false,500000,1988,"xworkz", true, false,true,true);
		
		Odc odc = new Odc();
		
		omkarsir.getjob();
		
		odc.takingfrom(omkarsir);
		
		

	}

}
