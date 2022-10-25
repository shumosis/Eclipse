package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;

public class FlowerRunner {
	
	public static void main(String[] args) {
		
		Flower flower = new Flower("rose");
			
		flower.setprice(300);
		flower.quantity=1;
		flower.getTotal();
		flower.ShoeToMe();

	}
}
