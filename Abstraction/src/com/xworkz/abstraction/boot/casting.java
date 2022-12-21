package com.xworkz.abstraction.boot;


class Atm {
	
	public void withdraw() {
		System.out.println("shu");
	}
	
	public void CheckBalance() {
		
		System.out.println("checking balance nadita ede");
		
		
	}
}
class Sbi extends Atm{
	public void withdraw() {
		String akshay= "Afreen";
	System.out.println(akshay);
	}
		
  	public void ministatement() 
  	{
  		 System.out.println("runnig mini nstatement");
  	 }
}

public class casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm a1=new Sbi();
		a1.CheckBalance();
		a1.withdraw();
		Sbi s1=(Sbi)a1;
		s1.CheckBalance();
		s1.withdraw();
		s1.ministatement();
		Sbi s2= new Sbi();
		s2.withdraw();
		
		
		
		
		

	}

}
