package com.xworkz.bridge;

public class BMRCL{
	
	
	private  Passenger passenger;
	
	public BMRCL(Passenger passenger) {
		super();
		this.passenger = passenger;
	}




	public void checkingRule() {
		if(passenger != null) {
			
			String wearmask=this.passenger.wearMask();
			
			String standAwayfromDoor = this.passenger.standAwayfromDoor();
		
			
			if (wearmask == "true" && standAwayfromDoor == "yes") {
			
			System.out.println("passengers are following the rules");
			
		}else {
			System.out.println("passengers are not following the rules");
		}
		
	}
	}
	
	
	

}
