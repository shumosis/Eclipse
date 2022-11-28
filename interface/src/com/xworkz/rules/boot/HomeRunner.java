package com.xworkz.rules.boot;

import com.xworkz.rules.things.FamillyMembers;
import com.xworkz.rules.things.Home;

public class HomeRunner {

	public static void main(String[] args) {
		
		Home home = new FamillyMembers();
		
		home.IfGf();
		home.lateNightParty();
		home.marrageAtAge();
		home.sleeptime();
		home.waketime();
	}

}
