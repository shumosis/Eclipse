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
	
	private String createdBy = "shumosis";
	private LocalDateTime createdtime = LocalDateTime.of(2022, 12, 20, 4, 0);
	private String updatedBy =  "shumosis";
	private  LocalDateTime  updatedTime = LocalDateTime.of(2022, 12, 20, 4, 0);

}
