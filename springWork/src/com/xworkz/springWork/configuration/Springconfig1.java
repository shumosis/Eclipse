package com.xworkz.springWork.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springWork")
public class Springconfig1 {
	@Bean
	public String getchair() {
	System.out.println("running getchair");	
	String string = new String("chair");	
	return string;
	}
	@Bean
	public String getTable() {
		System.out.println("running gettable");	
		String string = new String("table");	
		return string;
		}
	@Bean
	public String getfriedge() {
		System.out.println("running getfriedge");	
		String string = new String("friedge");	
		return string;
		}
	@Bean
	public String getmachine() {
		System.out.println("running getmachine");	
		String string = new String("machine");	
		return string;
		}
	@Bean
	public String gettv() {
		System.out.println("running gettv");	
		String string = new String("tv");	
		return string;
		}
	@Bean
	public boolean love() {
		System.out.println("running love");
		Boolean love = new Boolean(false);
		return love;
		}
	@Bean
	public boolean life() {
		System.out.println("running life");
		return false;
		}
	@Bean
	public boolean lifeIsScam() {
		System.out.println("running lifeisscam");
		return true;
		}
	@Bean
	public boolean taste() {
		System.out.println("running taste");
	    return false;
		}
	@Bean
	public boolean modi() {
		System.out.println("running modi");
		return false;
		}
	@Bean
	public double fees() {
		double fee = new Double(100000);
		System.out.println("runnig  ");
		return fee;
		}
	@Bean
	public double salary() {
		System.out.println("runnig  ");
		return 20000000;
		}
	@Bean
	public double price() {
		System.out.println("runnig  ");
		return 33000000;
		}
	@Bean
	public double rent() {
		System.out.println("runnig  ");
		return 50000000000d;
		}
	@Bean
	public double distance() {
		System.out.println("runnig  ");
		return 6666666666666666666666666666666666d;
	}
	@Bean
	public StringBuffer walk() {
		System.out.println("walking");
		StringBuffer buffer = new StringBuffer("walk");
	    return buffer;
	}
	@Bean
	public StringBuffer run() {
		System.out.println("runing");
		StringBuffer buffer = new StringBuffer("running");
	    return buffer;
	}
	@Bean
	public StringBuffer jump() {
		System.out.println("jumping");
		StringBuffer buffer = new StringBuffer("jumping");
	    return buffer;
	}
	@Bean
	public StringBuffer swim() {
		System.out.println("swiming");
		StringBuffer buffer = new StringBuffer("swim");
	    return buffer;
	}
	@Bean
	public StringBuffer eat() {
		System.out.println("eating");
		StringBuffer buffer = new StringBuffer(23);
	    return buffer;
	}
	@Bean
	public StringBuilder A() {
		System.out.println("running A ");
		StringBuilder der = new StringBuilder(45);
		return der;
	}
	@Bean
	public StringBuilder B() {
		System.out.println("running B ");
		StringBuilder der = new StringBuilder("shubham");
		return der;
	}
	@Bean
	public StringBuilder C() {
		System.out.println("running C ");
		StringBuilder der = new StringBuilder(45);
		return der;
	}
	@Bean
	public StringBuilder D() {
		System.out.println("running D ");
		StringBuilder der = new StringBuilder(60);
		return der;
	}
	@Bean
	public StringBuilder E() {
		System.out.println("running E ");
		StringBuilder der = new StringBuilder("garve");
		return der;
	}
	@Bean
	public ArrayList isLifeIsGood() {
		List<Boolean> list = Stream.of(true,false,true,false,false).collect(Collectors.toList());
		
		return (ArrayList) list;
		
	}
	@Bean
	public Map details() {
		
		Map<String, Integer> chocolats = new HashMap<String, Integer>();
		chocolats.put("cadberry", 10);
		chocolats.put("dairymilk", 30);
		chocolats.put("milkywhite", 80);
		chocolats.put("mango",70);
		chocolats.put("strawberry",90);
		
		return chocolats;
	}

	
    
		
	
	
	
	

}
