package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;

public class MilkRunner {
	public static void main(String[] args) {

		Milk milk = new Milk("buffalo");
			
		milk.setprice(44);
		milk.quantity=1;
		milk.getTotal();
		milk.ShoeToMe();

	}

}
