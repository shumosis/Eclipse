package com.xworkz.rules.boot;

import com.xworkz.rules.things.ArmyCamp;
import com.xworkz.rules.things.CampMembers;

public class ArmyRunner {

	public static void main(String[] args) {
		

		ArmyCamp armycamp = new CampMembers();
		
		armycamp.setCaptain();
		armycamp.setLocation();
		armycamp.setMembers();
		armycamp.sleepTime();
		armycamp.wakeTime();
	}

}
