package com.bridgelabs.functional_programs;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class StringReplace {
	public static void main(String[] args)
	 {
		 
	    System.out.println("Enter the username");
		String s1=FunctionalUtil.inputString();
		System.out.println("Enter the name u want to be replaced");
		 String s2=FunctionalUtil.inputString();
		 FunctionalUtil.Username(s2);
		 System.out.println( "hello " + s2 + ", how was the day??");
	 	 }
}
