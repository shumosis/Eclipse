package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;



public class BagRunner {

	public static void main(String[] args) {
		
		 String[] color= {"red","blue"};
         String[] shape= {"round","square","Cylindrical"};
		 String[] sizes= {"medium","big"};
		 String[] uses= {"laptopcarry","vaegetables"};
		 String[] types= {"handbag","sidebag","backpack"};
		
    Bag bag=new Bag("puma",5,3,25,3000,true,color, shape,
    		sizes,uses,types);
    
   bag.display() ;

	}

}
