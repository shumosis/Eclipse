package com.xworkz.associations.boot;
import com.xworkz.associations.things.*;
import com.xworkz.associations.things.Brand;
import com.xworkz.associations.things.Fuel;

public class FuelRunner {

	public static void main(String[] args)
	{
		Brand brand = new Brand();
		
		Location location= new Location();
		
		Fuel fuel = new Fuel(brand,true,101,5);
		fuel.showMeFuel();
		fuel.brand.shumos("hp",456, location, 10);
		fuel.brand.location.aksha("chord","rajajinagra", "karnataka", 587313, "india");
		fuel.brand.showmebrand();
		fuel.brand.location.showmeLocation();

	}

}
