package com.xworkz.map.boot2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Player {

	public static void main(String[] args) {
		
		
		Map<String,Double> player = new TreeMap<String,Double>((e1,e2)->e2.compareTo(e1));
		
		player.put("virat",12000D);
		player.put("surya", 8000D);
		player.put("rohit", 9000D);
		player.put("shikhar", 6000D);
		player.put("pant", 10000D);
		
	    
	    player.forEach((e1,e2)->System.out.println(e1+ " : "+e2));
		Set<Entry<String,Double>> dataof = player.entrySet();
		
		
		
		
       
		
		
		}
	
	}


