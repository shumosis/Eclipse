package com.xworkz.shumos.boot;

import com.xworkz.shumos.*;

public class CarRunner
{
	public static void main(String[] args) {
	String[] color= {"white","pink","blue"};
    String[] shape= {"square","ractangle"};
	 String[] sizes= {"king","long","small"};
	 String[] uses= {"travel","sleep"};
	 String[] types= {"suv","long","jeeps"};
	
Car car =new Car("nexon",4,3,1,3000000,true,color, shape,
		sizes,uses,types);

	
car.display();

	}
}


