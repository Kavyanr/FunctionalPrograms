package com.bridgelabs.functional_programs;

import com.bridgelabs.functionalutil.FunctionalUtil;

public class Quadratic {
	
  
	public static void main(String[] args)
	{
		System.out.println("Enter the value of a");
		int a=FunctionalUtil.inputinteger();
		System.out.println("Enter the value of b");
		int b=FunctionalUtil.inputinteger();
		System.out.println("Enter the value of c");
		int c=FunctionalUtil.inputinteger();
		FunctionalUtil.isQuadratic(a, b, c);
		
	}
}
