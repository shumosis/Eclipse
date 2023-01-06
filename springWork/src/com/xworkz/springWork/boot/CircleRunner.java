package com.xworkz.springWork.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springWork.configuration.springConfiguration;
import com.xworkz.springWork.things.Application;
import com.xworkz.springWork.things.Area;
import com.xworkz.springWork.things.BhashyamCircle;
import com.xworkz.springWork.things.Bus;
import com.xworkz.springWork.things.Chocolate;
import com.xworkz.springWork.things.City;
import com.xworkz.springWork.things.Cycle;
import com.xworkz.springWork.things.Fish;
import com.xworkz.springWork.things.Girl;
import com.xworkz.springWork.things.God;
import com.xworkz.springWork.things.Mall;
import com.xworkz.springWork.things.Mask;
import com.xworkz.springWork.things.Milk;
import com.xworkz.springWork.things.Park;
import com.xworkz.springWork.things.Patient;
import com.xworkz.springWork.things.Road;
import com.xworkz.springWork.things.Temple;

public class CircleRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(springConfiguration.class);
		BhashyamCircle ref = applicationContext.getBean(BhashyamCircle.class);
        System.out.println(ref);
        
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(springConfiguration.class);
		Application ref1 = applicationContext.getBean(Application.class);
        System.out.println(ref1);

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(springConfiguration.class);
		Area ref2 = applicationContext.getBean(Area.class);
        System.out.println(ref2);
        
        ApplicationContext applicationContext3 = new AnnotationConfigApplicationContext(springConfiguration.class);
		Bus ref3 = applicationContext.getBean(Bus.class);
        System.out.println(ref3);
        
        ApplicationContext applicationContext4 = new AnnotationConfigApplicationContext(springConfiguration.class);
		Chocolate ref4 = applicationContext.getBean(Chocolate.class);
        System.out.println(ref4);
        
        ApplicationContext applicationContext5 = new AnnotationConfigApplicationContext(springConfiguration.class);
		City ref5 = applicationContext.getBean(City.class);
        System.out.println(ref5);
        
        ApplicationContext applicationContext6 = new AnnotationConfigApplicationContext(springConfiguration.class);
		Cycle ref6 = applicationContext.getBean(Cycle.class);
        System.out.println(ref6);
        
        ApplicationContext applicationContext7 = new AnnotationConfigApplicationContext(springConfiguration.class);
		Fish ref7 = applicationContext.getBean(Fish.class);
        System.out.println(ref7);
        
        ApplicationContext applicationContext8 = new AnnotationConfigApplicationContext(springConfiguration.class);
         Girl ref8 = applicationContext.getBean(Girl.class);
        System.out.println(ref8);
        
        ApplicationContext applicationContext9 = new AnnotationConfigApplicationContext(springConfiguration.class);
		God ref9 = applicationContext.getBean(God.class);
        System.out.println(ref9);
        
        ApplicationContext applicationContext10 = new AnnotationConfigApplicationContext(springConfiguration.class);
		Mall ref10 = applicationContext.getBean(Mall.class);
        System.out.println(ref10);
        
        ApplicationContext applicationContext11 = new AnnotationConfigApplicationContext(springConfiguration.class);
		Mask ref11 = applicationContext.getBean(Mask.class);
        System.out.println(ref11);
        
        ApplicationContext applicationContext12 = new AnnotationConfigApplicationContext(springConfiguration.class);
		Milk ref12 = applicationContext.getBean(Milk.class);
        System.out.println(ref12);
        
        ApplicationContext applicationContext13 = new AnnotationConfigApplicationContext(springConfiguration.class);
		Park ref13 = applicationContext.getBean(Park.class);
        System.out.println(ref13);
        
        ApplicationContext applicationContext14 = new AnnotationConfigApplicationContext(springConfiguration.class);
		Patient ref14 = applicationContext.getBean(Patient.class);
        System.out.println(ref14);
        
        ApplicationContext applicationContext15 = new AnnotationConfigApplicationContext(springConfiguration.class);
		Road ref15 = applicationContext.getBean(Road.class);
        System.out.println(ref15);
        
        ApplicationContext applicationContext16 = new AnnotationConfigApplicationContext(springConfiguration.class);
		Temple ref16 = applicationContext.getBean(Temple.class);
        System.out.println(ref16);
	}

}
