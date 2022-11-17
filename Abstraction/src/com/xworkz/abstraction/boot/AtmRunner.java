package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.Atm;
import com.xworkz.abstraction.SbiAtm;

public class AtmRunner {

	public static void main(String[] args) {
		
		SbiAtm sbiatm = new SbiAtm();
		sbiatm.withdraw();
		sbiatm.CheckBalance();

	}

}
