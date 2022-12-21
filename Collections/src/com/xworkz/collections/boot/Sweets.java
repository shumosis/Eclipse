package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.TreeSet;

public class Sweets {

	public static void main(String[] args) {
		
		Collection<String> collection =new TreeSet();
		
		String sweet;
		
		
		collection.add("jamun") ;
		collection.add("jelibi") ;
		collection.add("kachori") ;
		collection.add("samosa") ;
		collection.add("papad") ;
		collection.add("rice") ;
		collection.add("chapati") ;
		collection.add("katali") ;
		collection.add("kaju") ;
		collection.add("badam") ;
		collection.add("pista") ;
		collection.add("ladu") ;
		collection.add("kahrik") ;
		collection.add("pati") ;
		collection.add("chicken") ;
		System.out.println(collection.size());
		collection.clear();
		System.out.println(	collection.size());

	}

}
