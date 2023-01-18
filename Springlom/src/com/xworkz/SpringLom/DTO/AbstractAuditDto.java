package com.xworkz.SpringLom.DTO;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AbstractAuditDto {
	
	private String createdBy;
	private LocalDateTime createdtime;
	private String updatedBy;
	private  LocalDateTime  updatedTime;

}
