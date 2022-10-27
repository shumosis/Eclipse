package com.xworkz.associations.boot;

import com.xworkz.associations.things.*;

public class PillerRunner {

	public static void main(String[] args) {
		
		Company  company = new Company();
		
		Piller piller=new Piller("1","tumkur",20,true,company);
	
		piller.showme();
		piller.company.showofff("shumos","contractorbase");

	}

}
