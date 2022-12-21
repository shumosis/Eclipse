package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Bike {

	public static void main(String[] args) {
		
		Collection<String> collection = new HashSet();
		
		String bike;
		
		 collection.add("r1");
		 collection.add("f1");
		 collection.add("y1");
		 collection.add("pulser");
		 collection.add("splender");
		 collection.add("scoioty");
		 collection.add("ather");
		 collection.add("ola");
		 collection.add("s1");
		 collection.add("m1");
		 collection.add("bullet");
		 collection.add("c1");
		 
		 collection.add("a1");
		 collection.add("k1");
		 collection.add("g1");
		 collection.add("h1");
		 collection.add("k1");
		 collection.add("l1");
		 collection.add("m1");
		 
          System.out.println(           collection.size()); 
          collection.clear();

          System.out.println(           collection.size()); 
	}

}
