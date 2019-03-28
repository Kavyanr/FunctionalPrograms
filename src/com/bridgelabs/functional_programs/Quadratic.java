package com.bridgelabs.functional_programs;

import com.bridgelabs.functionalutil.FunctionalUtil;

public class Quadratic {
	
  
	public static void main(String[] args)
	{
		System.out.println("Enter the value of a");
		int a=FunctionalUtil.inputInteger();
		System.out.println("Enter the value of b");
		int b=FunctionalUtil.inputInteger();
		System.out.println("Enter the value of c");
		int c=FunctionalUtil.inputInteger();
		FunctionalUtil.isQuadratic(a, b, c);
		
	}
}
