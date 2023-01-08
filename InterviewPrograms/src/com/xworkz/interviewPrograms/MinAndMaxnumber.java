package com.xworkz.interviewPrograms;

public class MinAndMaxnumber {
	
	
	   
	    public static void findMinAndMax(int[] nums)
	    {
	      
	        int max = nums[0];
	        int min = nums[0];
	 
	 
	        for (int i = 1; i < nums.length; i++)
	        {
	            
	            if (nums[i] > max) {
	                max = nums[i];
	            }
	 
	            
	             if (nums[i] < min) {
	                min = nums[i];
	            }
	        }
	 
	        System.out.println("The minimum array element is " + min);
	        System.out.println("The maximum array element is " + max);
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] nums = {4,3,2,1,5};
	 
	        // find the minimum and maximum element, respectively
	        findMinAndMax(nums);
	    }
	}


