package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;

public class ChainingRunner {
	
public static void main(String[] args) {
		
		Tractor tractor=new Tractor("SAG tractor",42,40000.0,"redom","black","2020");
		System.out.println(tractor.name);
		System.out.println(tractor.brand);
		System.out.println(tractor.color);
		System.out.println(tractor.price);
		System.out.println(tractor.hp);
		System.out.println(tractor.model);
		
		System.out.println(System.lineSeparator());

		TexttileShop texttileShope=new TexttileShop(4536,8767937837L);
		System.out.println(texttileShope.ownerName);
		System.out.println(texttileShope.ownerWifeName);
		System.out.println(texttileShope.ownerDaughterName);
		System.out.println(texttileShope.ownerDaughterNumber);
		System.out.println(texttileShope.ownerNoOfWifes);
		System.out.println(texttileShope.shopNo);
		System.out.println(texttileShope.contactNo);
		
		System.out.println(System.lineSeparator());

		Chain chain=new Chain(7, " thief", "cow", 'H');
		
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.length);
		System.out.println(chain.material);
		System.out.println(chain.weight);
		System.out.println(chain.stolen);
		System.out.println(chain.usedFor);
		System.out.println(chain.fresh);


		
		
		
	}


}
