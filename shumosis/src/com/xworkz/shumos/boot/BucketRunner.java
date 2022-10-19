package com.xworkz.shumos.boot;
import com.xworkz.shumos.*;
public class BucketRunner {

	public static void main(String[] args) {
		
		 String[] color= {"red","blue"};
         String[] shape= {"cylinder","square"};
		 String[] sizes= {"medium","big"};
		 String[] uses= {"water","cloths"};
		 String[] types= {"plastic","steel"};
		
    Bucket bucket=new Bucket("surya ",5,3,25,3000,true,color, shape,
    		sizes,uses,types);
    
   bucket.display() ;
  

	}

}
