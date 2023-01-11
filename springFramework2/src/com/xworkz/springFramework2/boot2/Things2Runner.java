package com.xworkz.springFramework2.boot2;

import java.lang.reflect.Array;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springFramework2.configuration2.SpringConfiguration2;
import com.xworkz.springFramework2.things2.HardwareShop;
import com.xworkz.springFramework2.things2.Pencil;
import com.xworkz.springFramework2.things2.Rubber;
import com.xworkz.springFramework2.things2.Sakshi;
import com.xworkz.springFramework2.things2.Software;
import com.xworkz.springFramework2.things2.SoftwareeEngineer;

public class Things2Runner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration2.class);
		
		System.out.println(container.getBeanDefinitionNames());
		
		
		HardwareShop refhardwareShop = container.getBean(HardwareShop.class);
		
		SoftwareeEngineer refsoftwareeEngineer = container.getBean(SoftwareeEngineer.class);
		
		Software refsoftware = container.getBean(Software.class);
		
		Pencil refpencil= container.getBean(Pencil.class);
		
		Rubber refrubber = container.getBean(Rubber.class);
		
		Sakshi refsakshu= container.getBean(Sakshi.class);
		
	

	}

}
