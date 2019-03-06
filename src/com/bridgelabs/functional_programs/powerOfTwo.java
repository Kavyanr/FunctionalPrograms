package com.bridgelabs.functional_programs;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class powerOfTwo {
    public static void main(String[] args)
	{
		System.out.println("Enter the value of n");
		int n=FunctionalUtil.inputinteger();
		System.out.println("Powers of 2 that are less than 2^" +n);	
		int power=FunctionalUtil.isPower(n);
		if(power==0)
			System.err.println("Overflow");
		else
			System.out.println(power);

	}
}