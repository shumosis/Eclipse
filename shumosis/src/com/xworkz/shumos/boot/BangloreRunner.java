package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;

public class BangloreRunner {

	public static void main(String[] args)
	{
		String[] itarea= {"coramangala","white field","electronic city"};
		 String[] institutes= {"hareesh","manu","joshi"};
		 String[] temple= {"annapoorneshwari","iscon"};
		 String[] xwork= {"btm layout","rajajinagar"};
		
		 Banglore banglore =new Banglore("unicorn",4,3,1,30,true,itarea, temple,  institutes
				 , xwork, null);
   
		 banglore.display() ;


	}

}
