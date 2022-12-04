package com.xworkz.bridge;

public class AirportAuthority {
	
	private Airport airport;

	public AirportAuthority(Airport airport) {
		super();
		this.airport = airport;
	}
	
	public void checkRules() {
		if(airport!=null) {
			
			boolean keepClean =this.airport.keepClean();
					
		    boolean carryAadhar = this.airport.carryAadhar();
			
		    if(keepClean == true && carryAadhar==true) {
		    	
		    	System.out.println("passengers are following the rule");
		    	
		    }else {
		    	System.out.println("passengers are not following the rule");
		    }
		}
		
	}

}
