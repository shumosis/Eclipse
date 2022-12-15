package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepoImpl;
import com.xworkz.ipl.repository.IplRepository;

public class IplRunner {

	public static void main(String[] args) {
		
		IplRepoImpl iplrepo = new IplRepoImpl();
		
		IplDTO ipldto = new IplDTO();

		ipldto.setCaptainNmae("virat");
		ipldto .setCoach("shumosis");
		ipldto .setCups(0);
		ipldto .setDaughterName("radhika");
		ipldto .setLosses(111);
		ipldto .setNo_of_players("11");
		ipldto .setOwnwerName("shbhamGarve");
		ipldto .setPurse(90);
		ipldto .setTeamName("rcb");
		ipldto .setWins(110);
		
		
		
		ipldto.setCraetedBy("shumosis");
		ipldto.setCreatedDate(LocalDateTime.now());
		
		iplrepo.create(ipldto);
		iplrepo.total();
		
	
	}

}
