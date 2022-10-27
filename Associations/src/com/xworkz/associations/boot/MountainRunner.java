package com.xworkz.associations.boot;
import com.xworkz.associations.things.Location;
import com.xworkz.associations.things.God;
import com.xworkz.associations.things.Mountain;
import com.xworkz.associations.things.Temple;
import com.xworkz.associations.things.Weapon;

public class MountainRunner {

	public static void main(String[] args) {
		
		Location location=new Location();
		Temple temple= new Temple();
		God god = new God();
		Weapon weapon = new Weapon ();
		
		Mountain mountain = new Mountain ();
		
		mountain.showMountain("giri",location ,100, temple);
		System.out.println("==================================");
		mountain.location.aksha("chord","rajajinagra", "karnataka", 587313, "india");
		mountain.location.showmeLocation();
		System.out.println("====================================");
		mountain.temple.showTemple("iskon", god,"swami nityanad", 2344657, 1000000);
		System.out.println("====================================");
		mountain.temple.god.showgod("mahadev", "male", weapon, "3rdeye");
		System.out.println("====================================");
		mountain.temple.god.weapon.showWeapon("brahmastra","lightning",100);

	}

}
