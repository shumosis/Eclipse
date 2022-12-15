package com.xworkz.ipl.dto;

import java.time.LocalDateTime;

public class IplDTO extends AbstractAuditDto {
	
	private String teamName;
	private String captainNmae;
	private String ownwerName;
	private String daughterName;
	private double purse;
	private int wins;
	private int losses;
	private int cups;
	private String coach;
	private String no_of_players;
	
	public IplDTO() {
		System.out.println("calling deafault constructor of IplDTO");
	}
	
	

	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", captainNmae=" + captainNmae + ", ownwerName=" + ownwerName
				+ ", daughterName=" + daughterName + ", purse=" + purse + ", wins=" + wins + ", losses=" + losses
				+ ", cups=" + cups + ", coach=" + coach + ", no_of_players=" + no_of_players + "]";
	}



	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptainNmae() {
		return captainNmae;
	}

	public void setCaptainNmae(String captainNmae) {
		this.captainNmae = captainNmae;
	}

	public String getOwnwerName() {
		return ownwerName;
	}

	public void setOwnwerName(String ownwerName) {
		this.ownwerName = ownwerName;
	}

	public String getDaughterName() {
		return daughterName;
	}

	public void setDaughterName(String daughterName) {
		this.daughterName = daughterName;
	}

	public double getPurse() {
		return purse;
	}

	public void setPurse(double purse) {
		this.purse = purse;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getCups() {
		return cups;
	}

	public void setCups(int cups) {
		this.cups = cups;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getNo_of_players() {
		return no_of_players;
	}

	public void setNo_of_players(String no_of_players) {
		this.no_of_players = no_of_players;
	}



	public void setCreatedDate(LocalDateTime now) {
      	
	}
	

}
