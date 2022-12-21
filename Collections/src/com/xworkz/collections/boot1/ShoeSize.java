package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String[] args) {
		
		Collection<Integer> shoeSize = new ArrayList<Integer>() ;
		
		int size1= 1;
		int size2= 2;
		int size3 = 3;
		int size4= 4;
		int size5= 5;
		int size6= 6;
		int size7= 7;
		int size8= 8;
		int size9= 9;
		int size10= 10;
		int size11 = 11;
		int size12 =12 ;
		int size13 = 13;
		int size14 =14 ;
		int size15 =15;
		int size16 =16 ;
		
		 shoeSize.add(size1);
		 shoeSize.add(size2);
		 shoeSize.add(size3);
		 shoeSize.add(size4);
		 shoeSize.add(size5);
		 shoeSize.add(size6);
		 shoeSize.add(size7);
		 shoeSize.add(size8);
		 shoeSize.add(size9);
		 shoeSize.add(size10);
		 shoeSize.add(size11);
		 shoeSize.add(size12);
		 shoeSize.add(size13);
		 shoeSize.add(size14);
		 shoeSize.add(size15);
		 shoeSize.add(size16);
		 
		System.out.println(shoeSize.size());
		
	     Iterator<Integer> ref = shoeSize.iterator();
	     
	     while(ref.hasNext()) {
	    	 
	    	 Integer value = ref.next();
	    	 System.out.println(value);
	     }
	}

}
