package com.bridgelabs.functional_programs;

import com.bridgelabs.functionalutil.FunctionalUtil;

public class Permutation {

	// Recursive function to generate all permutations of a String
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		String input=FunctionalUtil.inputString();
		FunctionalUtil.permutation(input);
    } 
}
  