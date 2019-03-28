package com.bridgelabs.functional_programs;

import com.bridgelabs.functionalutil.FunctionalUtil;

public class LeapYear {
	public static void main(String[] args)
	{
		System.out.println("Enter the year");
         int year=FunctionalUtil.inputInteger();
         FunctionalUtil.Checkyear(year);
        
	}
	
}
