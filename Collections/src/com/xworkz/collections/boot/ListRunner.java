package com.xworkz.collections.boot;


import java.util.ArrayList;
import java.util.List;

public class ListRunner {

	public static void main(String[] args) {
		
	List<String> list = new ArrayList<String>();
	
	list.add("a");
	list.add("b");
	list.add("c");
    list.add(3, "e");
	
for(String string : list) {
	System.out.println(string);
}
System.out.println("==========================================");
   list.set(0, "A");
   
   for(String string : list) {
		System.out.println(string);
   }
   System.out.println("==========================================");
   list.add("B");
   for(String string : list) {
 		System.out.println(string);
    }
    System.out.println("==========================================");
    
   System.out.println( list.get(3));
   
   
   System.out.println("==========================================");
   list.remove(0);
   for(String string : list) {
 		System.out.println(string);
    }
    System.out.println("==========================================");
    
    
	}
	
	

}
