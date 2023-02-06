package com.xworkz.collections.streamboot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.collections.streamDto.Type;
import com.xworkz.collections.streamDto.WeaponDto;

public class WeaponDtoRunner {
	
	
	

	public static void main(String[] args) {
		
		WeaponDto weapondto = new WeaponDto("Ak47", "shumosis",LocalDate.of(1997,12,1),10000d,Type.MINI_GUN);
		WeaponDto weapondto1 = new WeaponDto("mini40","vinoda",LocalDate.of(1998, 2,8),5000d,Type.MINI_GUN);
		WeaponDto weapondto2 = new WeaponDto("UB","shekhar",LocalDate.of(2003,9, 20), 6000d,Type.SHORT_GUN);
		WeaponDto weapondto3 = new WeaponDto("cat","akki",LocalDate.of(2003,9,30),8000D,Type.MINI_GUN);
		WeaponDto weapondto4 = new WeaponDto("bola", "shubham", LocalDate.of(2004, 1, 12), 100000d,Type.COMBAT_WEAPONS);
		WeaponDto weapondto5 = new WeaponDto("tomahawk", "germany", LocalDate.of(2000, 2, 11), 200000d,Type.COMBAT_WEAPONS);
		WeaponDto weapondto6 = new WeaponDto("	sword", "india", LocalDate.of(1980, 3, 10), 3000d,Type.COMBAT_WEAPONS);
		WeaponDto weapondto7 = new WeaponDto("quarterstaff", "manu", LocalDate.of(1990, 4, 2), 40000d,Type.COMBAT_WEAPONS);
		WeaponDto weapondto8 = new WeaponDto("pike", "chetank", LocalDate.of(2000, 5, 3), 50000d,Type.COMBAT_WEAPONS);
		WeaponDto weapondto9 = new WeaponDto("lance", "mustafa", LocalDate.of(2006, 6, 5), 60000d,Type.COMBAT_WEAPONS);
		WeaponDto weapondto10 = new WeaponDto("halberd", "vaibhav", LocalDate.of(2014, 2, 6), 7000d,Type.COMBAT_WEAPONS);
		WeaponDto weapondto11 = new WeaponDto("dagger", "hareesh", LocalDate.of(2006, 2, 7), 8000d,Type.COMBAT_WEAPONS);
		WeaponDto weapondto12 = new WeaponDto("club", "kartik", LocalDate.of(2009, 2, 8), 9000d,Type.COMBAT_WEAPONS);
		WeaponDto weapondto13 = new WeaponDto("bayonet", "darshan", LocalDate.of(2010, 2, 9), 4000d,Type.COMBAT_WEAPONS);
		WeaponDto weapondto14 = new WeaponDto("boomerang", "ramesh", LocalDate.of(2013, 2, 10), 3000d,Type.ranged_weapons);
		WeaponDto weapondto15 = new WeaponDto("	bow and arrow", "ravi", LocalDate.of(2012, 2, 11), 20000d,Type.ranged_weapons);
		WeaponDto weapondto16 = new WeaponDto("crossbow", "teja", LocalDate.of(2011, 1, 12), 15000d,Type.ranged_weapons);
		WeaponDto weapondto17 = new WeaponDto("longbow", "kavi", LocalDate.of(2010, 1, 6), 35000d,Type.ranged_weapons);
		WeaponDto weapondto18 = new WeaponDto("grapeshot", "shrisham", LocalDate.of(2009, 2, 7), 8930d,Type.ranged_weapons);
		WeaponDto weapondto19 = new WeaponDto("flamethrower", "vinnay", LocalDate.of(2008, 2, 8), 5000d,Type.ranged_weapons);
		WeaponDto weapondto20 = new WeaponDto("Greek fire", "tilak", LocalDate.of(2007, 3, 9),3467d,Type.ranged_weapons);
		
		Collection<WeaponDto> dtos = Stream.of(weapondto, weapondto1, weapondto2, weapondto3, weapondto4, weapondto5, weapondto6, weapondto7, weapondto8, weapondto9, weapondto10, weapondto11,
				weapondto12, weapondto13, weapondto14, weapondto15, weapondto16, weapondto17, weapondto18, weapondto19,weapondto20 ).collect(Collectors.toList());
		
	
	dtos.stream().filter((e)->e.getPrice()>10000d).sorted((e1,e2)->e1.getPrice().compareTo(e2.getPrice())).collect(Collectors.toList()).forEach(e1->System.out.println(e1));
	
		System.out.println("shubhmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
		dtos.stream().forEach(e -> {
			System.out.println("Made By: " + e.getMadeBy());
			System.out.println("Made On: " + e.getMadeOn());
		});

		System.out.println("\n3. Sort by Name in desc ========= mmmmmmmmmmmmmmmmmmmmmmm");
		dtos.stream().sorted().forEach(e -> System.out.println(e));

		System.out.println("\n4. Sort by Made by =========");
		dtos.stream().sorted((a1, a2) -> a1.getMadeBy().compareTo(a2.getMadeBy())).forEach(e -> System.out.println(e));

		System.out.println("\n5. Sort by Made On =========");
		Comparator<WeaponDto> comparator1 = (a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn());
		dtos.stream().sorted(comparator1).forEach(e -> System.out.println(e));

		System.out.println("\n6. Sort by Price in asc =========");
		dtos.stream().sorted((e1,e2)->e1.getPrice().compareTo(e2.getPrice())).collect(Collectors.toList()).forEach(e1->System.out.println(e1));
	

		System.out.println("\n7. Sort by Price in dsc =========");
		dtos.stream().sorted((e1,e2)->e2.getPrice().compareTo(e1.getPrice())).forEach(e1->System.out.println(e1));

		System.out.println("\n6. Sort by name & made on in asc =========");
		dtos.stream().sorted((a1, a2) -> a2.getMadeOn().compareTo(a1.getMadeOn()))
				.forEach(e -> System.out.println(e));

		
	}
	

	
}
