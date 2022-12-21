package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.Atm;
import com.xworkz.abstraction.SbiAtm;

public class AtmRunner {

	public static void main(String[] args) {
		
		Atm atm = new SbiAtm();
	    SbiAtm sbiatm =(SbiAtm)atm;
		
		sbiatm.withdraw();
		sbiatm.CheckBalance();
	     sbiatm.ministatement();
        
	}
	


}
