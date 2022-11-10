package com.xworkz.shumoss.overriding;

public class Venkateshwara extends PetrolBunk{
     public int petrolPrice;
	public int price;
	@Override
	public void filling() {

	super.filling();
	}

   public void filling(int price) {
	   this.price =price;
	   System.out.println(price);
   }
	public void takingMoney(int petrolPrice) {
		
	this.petrolPrice= petrolPrice;
	System.out.println(petrolPrice);
	}
	
    
}
