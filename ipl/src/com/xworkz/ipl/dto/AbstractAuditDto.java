package com.xworkz.ipl.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class AbstractAuditDto implements Serializable{
	
	private String craetedBy;
	private LocalDateTime createdDate;
	private String upadateBy;
	private LocalDateTime upadateTime;
	
	public AbstractAuditDto() {
		System.out.println("calling deafault constructor of abstractAuditDto ");
	}

	public String getCraetedBy() {
		return craetedBy;
	}

	public void setCraetedBy(String craetedBy) {
		this.craetedBy = craetedBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpadateBy() {
		return upadateBy;
	}

	public void setUpadateBy(String upadateBy) {
		this.upadateBy = upadateBy;
	}

	public LocalDateTime getUpadateTime() {
		return upadateTime;
	}

	public void setUpadateTime(LocalDateTime upadateTime) {
		this.upadateTime = upadateTime;
	}
	
	
	
	

}
