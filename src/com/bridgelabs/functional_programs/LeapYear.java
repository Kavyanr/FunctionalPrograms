package com.bridgelabs.functional_programs;

import com.bridgelabs.functionalutil.FunctionalUtil;

public class LeapYear {
	public static void main(String[] args)
	{
		System.out.println("Enter the year");
         int year=FunctionalUtil.inputInteger();
          boolean result= FunctionalUtil.Checkyear(year);
          if(true)
 		System.out.println("Given year is a leap year");
          else
        	  System.out.println("Given year is not a leap year");
	}
	}	

