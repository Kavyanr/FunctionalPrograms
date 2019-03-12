package com.bridgelabs.functional_programs;

import com.bridgelabs.functionalutil.FunctionalUtil;

public class powerOfTwo {
	public static void main(String[] args)
	{

		int n=Integer.parseInt(args[0]);
		System.out.println("Powers of 2 that are less than 2^" +n);	
		FunctionalUtil.isPower(n);



	}
}