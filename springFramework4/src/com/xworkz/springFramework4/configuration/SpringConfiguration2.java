package com.xworkz.springFramework4.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springFramework4")
public class SpringConfiguration2 {
	
	
	
	public SpringConfiguration2() {
		System.out.println("running spring configuration");
	}
	
	@Bean		
	public String name() {
		
		String name =new String( "preethiHardware");
		
		return name;
		
	}
	@Bean
     public String  gstNo() {
		
		String  gstNo =new String( "ABV3452PL");
		
		return  gstNo;
		
	}
	@Bean
     public String location() {
 		
 		String location =new String( "rajajinagr");
 		
 		return location;
 		
 	}
	@Bean
     public String id() {
 		
 		String id =new String( "shumosis");
 		
 		return id;
 		
 	}
	@Bean
     public String ownerName() {
 		
 		String ownerName =new String( "shubham Garve");
 		
 		return ownerName;
 		
 	}
	
	
	@Bean		
	public String nameofSoftEng() {
		
		String name =new String( "Vinoda Mam");
		
		return name;
	}
	
	@Bean
    public String CompanyName() {
		
		String CompanyName =new String( "xworkz");
		
		return CompanyName;
	}
	@Bean
	 public int experience() {
			
			int experience =3;
			
			return experience ;
		}
     @Bean
	 public int salary() {
			
			int salary =3000;
			
			return salary ;
		}
     
	
		@Bean		
         public String developer() {
					
		String name =new String( "Omkar Sir");
					
		return name;
		}
     @Bean		
 	public String nameOfSoftware() {
 		
 		String name =new String( "amazon");
 		
 		return name;
 	}
 	@Bean
	 public int version() {
			
			int version =6;
			
			return version ;
		}
	@Bean
	 public boolean free() {
			
			boolean free =true;
			
			return true  ;
		}
	
	@Bean
	 public LocalDate date() {
			
		LocalDate date =LocalDate.of(1997, 12, 30);
			
			return date ;
		}

	@Bean		
	public String nameofPencil() {
				
	String name =new String( "natu");
				
	return name;
	}
	@Bean		
	public String typeOfPencil() {
		
		String name =new String( "extraDark");
		
		return name;
	}
	@Bean		
	public String nameofColor() {
		
		String name =new String( "black");
		
		return name;
	}
	
	@Bean
	 public int priceOfPencil() {
			
			int price =6;
			
			return price ;
		}
	@Bean
	 public boolean Sharp() {
			
			boolean sharp =true;
			
			return true  ;
		}
	@Bean
	 public boolean stolen() {
			
			boolean stolen =true;
			
			return true  ;
		}
	
	@Bean		
	public String nameofRubber() {
				
	String name =new String( "Apsara");
				
	return name;
	}
	@Bean		
	public String typeOfrubber() {
		
		String name =new String( "smooth");
		
		return name;
	}
	@Bean		
	public String nameofColorOfRubber() {
		
		String name =new String( "black");
		
		return name;
	}
	
	@Bean
	 public int priceOfRubber() {
			
			int price =6;
			
			return price ;
		}
	@Bean
	 public String sizeOfRubber() {
			
			String  si ="medium";
			
			return si ;
		}
	@Bean
	 public boolean stolenRubber() {
			
			boolean stolen =true;
			
			return true  ;
		}
	
	@Bean
    public String sakshiType() {
		
		String ownerName =new String( "myType");
		
		return ownerName;
		
	}
	@Bean
    public String surName() {
		
		String ownerName =new String( "Garve");
		
		return ownerName;
		
	}
	@Bean
    public String CityName() {
		
		String ownerName =new String( "pune");
		
		return ownerName;
		
	}
	@Bean
	 public boolean goodGirl() {
			
			boolean stolen =true;
			
			return true  ;
		}
	@Bean
	 public int ageOfSakshi() {
			
			int age=22;
			
			return age;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
