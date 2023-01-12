package com.xworkz.springFramework5.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	private String name;
	@Autowired
	@Qualifier("Snakelength")
	private int length; 
	private boolean poisonous;
	@Autowired
	@Qualifier("SnakeColor")
	private String color;
	private String type;
	
	@Autowired
	public Snake(@Qualifier("SnakeName")String name, @Qualifier("ispoisonous")boolean poisonous, @Qualifier("SnakeType")String type) {
		super();
		this.name = name;
		this.poisonous = poisonous;
		this.type = type;
	}


	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", poisonous=" + poisonous + ", color=" + color
				+ ", type=" + type + "]";
	}
	
	
	
	
	
	

}
