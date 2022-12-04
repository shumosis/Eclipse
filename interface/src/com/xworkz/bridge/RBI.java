package com.xworkz.bridge;

public class RBI {
	
	private AccoutHolder  accoutHolder ;

	public RBI(AccoutHolder accoutHolder) {
		super();
		this.accoutHolder = accoutHolder;
	}
	
	public void checkRules() {
		
		if(accoutHolder != null) {
			
			int minBalance = this.accoutHolder.minBalance();
			boolean wearMask=this.accoutHolder.wearMask();
			
			if(minBalance == 100 && wearMask == true) {
				System.out.println("accoutHolder following the rules");
			}else
			{
				System.out.println("accoutHolder is not following the rules");
			}
		}
		
	}
	
	

}
