package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;

public class ShirtBrandRunner {

	
	public static void main(String[] args) {
		
		ShirtBrand brand = new ShirtBrand("kajukatali");
		
		brand.setprice(5000);
		brand.quantity = 1;
		brand.getTotal();
		brand.ShoeToMe();
		
	}
}
