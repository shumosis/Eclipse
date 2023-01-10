package com.xworkz.springFramework2.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	
	private String name;
	private String lang;
	private int age;
	
	
	
	
	public Actor(@Value("Akshay")String name,@Value("kannada") String lang,@Value("25") int age) {
		this.name = name;
		this.lang = lang;
		this.age = age;
	}




	public String getName() {
		return name;
	}




	public String getLang() {
		return lang;
	}




	public int getAge() {
		return age;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void setLang(String lang) {
		this.lang = lang;
	}




	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
