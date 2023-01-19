package com.xworkz.SpringLom.DTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SolderDto extends AbstractAuditDto{
	
   
	@NotNull
	@NotBlank
	@Size(min = 3,max =20 , message = "name lenght shoud be min3 and max 20")
	private String name ;
   
	@Min(0)
	@Max(1000000)
	private int id;
    
	@NotNull
	@NotBlank
	@Size(min = 3,max =50 , message = "country lenght shoud be min3 and max 20")
	private String country = "indiaaa";
    
	@NotNull
	@NotBlank
	@Size(min = 2,max =40 , message = "batalian lenght shoud be min3 and max 20")
	private String batalian ;
   
	@NotNull
	@NotBlank
	@Size(min = 3,max =30 , message = "rank lenght shoud be min3 and max 20")
    
	private String rank ;
    @NonNull
	private boolean alive;

}
