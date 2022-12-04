package com.xworkz.bridge;

public class Library {
	
	private Reader reader;

	public Library(Reader reader) {
		super();
		this.reader = reader;
	}
	
	public void checkingrules() {
		if (reader!= null) {
			int membershipFees=this.reader.membershipFees();
			
			boolean maintainsailence=this.reader.maintainsailence();
			
			if(membershipFees == 700 && maintainsailence == true) {
				
	           System.out.println("reader is following the rules");
				
			}else {
				System.out.println("reader is not folowing the rules");
			}
				
				
			
			
		}
		
		
	}
	
	

}
