package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
	
		Map<String, Double> entrys = new HashMap<String, Double>();
		
		entrys.put("shubhamPg",60000D );
		entrys.put("manusPg",5000D );
		entrys.put("AkshayPg",3000D );
		entrys.put("kartikPg",0000D );
		entrys.put("RameshPg",4000D);
		entrys.put("raviPg",6000D );
		entrys.put("hareeshaPg",5000D );
		entrys.put("TilakPg",4000D);
		entrys.put("natuByankiPg",4500D);
		entrys.put("darshanPg",4888D );
		entrys.put("shrishamPg",6000D );
		
		Collection<Double> value = entrys.values();
		value.forEach(e->System.out.println(e));
		
		Set<String> keyvalue = entrys.keySet();
		keyvalue.forEach(e->System.out.println(e));
		
		Set<Entry<String, Double>> ref = entrys.entrySet();
		ref.forEach(e->System.out.println(e.getKey()+"  "+e.getValue()));
		
		System.out.println("Values printing ======================== ");
		Map<String, Integer> chocolats = new HashMap<String, Integer>();
		chocolats.put("cadberry", 10);
		chocolats.put("dairymilk", 30);
		chocolats.put("milkywhite", 80);
		chocolats.put("mango",70);
		chocolats.put("strawberry",90);
		chocolats.put("gems",78);
		chocolats.put("amul", 62);
		chocolats.put("rum", 50);
		chocolats.put("eclayrs", 10);
		chocolats.put("Coffico", 80);

		
		
		Collection<Integer> chocolateValue = chocolats.values();
		chocolateValue.forEach(e -> System.out.println(e));
		
		

		Set<String> choclateSet = chocolats.keySet();
		choclateSet.forEach(e -> System.out.println(e));
		

		Set<Entry<String, Integer>> choclateEntry = chocolats.entrySet();
		choclateEntry.forEach(e -> System.out.println(  e.getKey() + " "+ e.getValue()));
		
		
		System.out.println("Values printing ======================== ");
		Map<Long, String> areas = new HashMap<Long, String>();

		areas.put(416116L, "shirdhon");
		areas.put(416121L, "takawade");
		areas.put(416115L, "shirol");
		areas.put(590053L, "mysore");
		areas.put(580080L, "maglore");
		areas.put(577712L, "Belagm");
		areas.put(578435L, "kolhapur");
		areas.put(416113L, "kamron");
		areas.put(415112L, "shirol");

	
		
		Collection<String> areaValue = areas.values();
		areaValue.forEach(e -> System.out.println(e));


		Set<Long> areaSet = areas.keySet();
		areaSet.forEach(e -> System.out.println(e));
		System.out.println("All Entries Printing");

		Set<Entry<Long, String>> areaEntry = areas.entrySet();
		areaEntry.forEach(e -> System.out.println("Keys   : " + e.getKey() + "  Values   : " + e.getValue()));
		
		
		System.out.println("Values printing ======================== ");
		Map<String, String> companys = new HashMap<String, String>();

		companys.put("Amezon", "AmezonSoftware");
		companys.put("Google", "Angular Softwares");
		companys.put("Facebook", "React softwares");
		companys.put("Meta", "Watsapp");
		companys.put("Microsoft", "MS Office");
		companys.put("Xworkz", "XworkzSoftware");
		companys.put("Microsofts", "Windows10");
		companys.put("Tcs", "Banking Application");
		companys.put("Axixs", "Axixs Software");
		companys.put("ICICI", "ICICI Softwares");

	
		Collection<String> companyValue = companys.values();
		companyValue.forEach(e -> System.out.println(e));
		

		Set companySet = companys.keySet();
		companySet.forEach(e -> System.out.println(e));


		Set<Entry<String, String>> companyEntry = companys.entrySet();
		companyEntry.forEach(e -> System.out.println("Keys   : " + e.getKey() + "  Values   : " + e.getValue()));
	

	}

}
