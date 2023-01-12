package com.xworkz.springFramework5.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springFramework5.beans")
public class SpringConfiguration {
	@Bean
	public String ghostName() {
		System.out.println("registerring ghostname");
		return "unknown";
	}
	@Bean
	public String ghostcity() {
		System.out.println("registerring ghostname");
		return "mudhol";
	}
	@Bean
	public String ghostgf() {
		System.out.println("registerring ghostname");
		return "sunny";
	}
	@Bean
	public String ghostwife() {
		System.out.println("registerring ghostname");
		return "sarika";
	}
	@Bean
	public String ghostmother() {
		System.out.println("registerring ghostname");
		return "syreka";
	}
	@Bean
	public String ghostfather() {
		System.out.println("registerring ghostname");
		return "sunil";
	}
	@Bean
	public String ghostgirl() {
		System.out.println("registerring ghostname");
		return "ramya";
	}
	@Bean
	public String ghostboy() {
		System.out.println("registerring ghostname");
		return "ramesh";
	}
	@Bean
	public String ghostGrandMother() {
		System.out.println("registerring ghostname");
		return "kantaben";
	}
	@Bean
	public String ghostGrandFather() {
		System.out.println("registerring ghostname");
		return "kalmesh";
	}
	@Bean
	public int ghostkids(){
		System.out.println("registerring ghostname");	
		return 2;
	}
	@Bean
public int ghostage(){
		System.out.println("registerring ghostname");	
		return 45;
	}
	@Bean
public int ghostmotherage(){
		System.out.println("registerring ghostname");	
	return 78;
}
	@Bean
public int ghostfatherage(){
		System.out.println("registerring ghostname");
	return 82;
}
	@Bean
public int ghostGrandFatherAge(){
		System.out.println("registerring ghostname");
	return 106;
}
	@Bean
public int ghostGrandMotherAge(){
		System.out.println("registerring ghostname");
	return 104;
}
	@Bean
public int ghostWifeAge(){
		System.out.println("registerring ghostname");
	return 40;
}
	@Bean
public int ghostGFAge(){
		System.out.println("registerring ghostname");
	return 38;
}
	@Bean
public int ghostGirlAge(){
		System.out.println("registerring ghostname");
	return 24;
}
	@Bean
public int ghostBoyAge(){
		System.out.println("registerring ghostname");
	return 24;
}
	@Bean
public double ghostNumber(){
		System.out.println("registerring ghostname");
	return 8867119798d;
}
	@Bean
	public String NPid() {
		System.out.println("registerring newspapaer");
		return "AWF2020R";
	}
	@Bean
	public String NPname() {
		System.out.println("registerring newspapaer");
		return "sakal";
	}

	@Bean
	public String NPlang() {
		System.out.println("registerring newspapaer");
		return "hindi";
	}

	@Bean
	public String NPowner() {
		System.out.println("registerring newspapaer");
		return "rahul gandhi";
	}
	@Bean
	public int NPprice() {
		System.out.println("registerring newspapaer");
		return 3;
	}
	@Bean
	public String SnakeName() {
		System.out.println("registerring newspapaer");
		return "x";
	}
	@Bean
	public String SnakeColor() {
		System.out.println("registerring newspapaer");
		return "green";
	}
	@Bean
	public String SnakeType() {
		System.out.println("registerring newspapaer");
		return "cobara";
	}
	@Bean
	public int Snakelength() {
		System.out.println("registerring newspapaer");
		return 5;
	}
	@Bean
	public boolean ispoisonous() {
		System.out.println("registerring newspapaer");
		return true;
	}
	@Bean
  public String engineName() {
	  System.out.println("registerring engine");
	return "honda";
  }
	@Bean
  public String enginetypr() {
	  System.out.println("registerring engine");
	return "diesel";
  }
	@Bean
  public String engineCompany() {
	  System.out.println("registerring engine");
	return "honda";
  }
	@Bean
	  public int engineVersion() {
		  System.out.println("registerring engine");
		return 5;
	  }
	@Bean
	  public int engineStrokes() {
		  System.out.println("registerring engine");
		return 4;
	  }
	@Bean
	  public int engineNumber() {
		  System.out.println("registerring engine");
		return 37;
	  }







}

