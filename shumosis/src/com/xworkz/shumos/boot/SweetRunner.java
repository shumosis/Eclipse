package com.xworkz.shumos.boot;

import com.xworkz.shumos.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
		
		Sweet sweet = new Sweet("kajukatali");
		
		sweet.setprice(300);
		sweet.quantity=37;
		sweet.getTotal();
		sweet.ShoeToMe();
		
	

	}

}
