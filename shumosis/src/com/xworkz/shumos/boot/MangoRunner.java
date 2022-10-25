package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;

public class MangoRunner {

	public static void main(String[] args) {

		Mango mango = new Mango("devgad");
			
		mango.setprice(300);
		mango.quantity=1;
		mango.getTotal();
		mango.ShoeToMe();


	}

}
