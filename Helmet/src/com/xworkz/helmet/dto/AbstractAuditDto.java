package com.xworkz.helmet.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AbstractAuditDto implements Serializable {
	
	private String createdby;
	private LocalTime localDateTime;
	private String updatedBy;
	private LocalDateTime updatedDateTime;
	
	
	public AbstractAuditDto()
	{
		System.out.println("Calling the no-argu consturction of AbstractAuditDto");
	}
	
	
	
	
	public AbstractAuditDto(String createdby, LocalTime localTime) {
		this.createdby = createdby;
		this.localDateTime = localTime;
		
	}




	@Override
	public String toString() {
		return "AbstractAuditDto [createdby=" + createdby + ", localDateTime=" + localDateTime + ", updatedBy="
				+ updatedBy + ", updatedDateTime=" + updatedDateTime + "]";
	}


	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public LocalTime getCreatedDateTime() {
		return localDateTime;
	}
	public void setCreatedDateTime(LocalTime LocalDateTime) {
		this.localDateTime = LocalDateTime;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDateTime getUpdatedDateTime() {
		return updatedDateTime;
	}
	public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}


}
