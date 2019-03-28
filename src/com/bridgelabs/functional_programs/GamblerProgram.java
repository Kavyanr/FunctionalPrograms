package com.bridgelabs.functional_programs;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class GamblerProgram {

	public static void main(String[] args) {

		System.out.println("Enterthe value for stake");
		int stake  =FunctionalUtil.inputInteger();
		System.out.println("Enter the value for goal");
		int goal   = FunctionalUtil.inputInteger(); 
		System.out.println("Enter the value for trials");
		int trials = FunctionalUtil.inputInteger();
		}
}


