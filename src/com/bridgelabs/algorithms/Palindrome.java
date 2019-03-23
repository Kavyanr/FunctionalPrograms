package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the starting number");
		int min=Algorithm_Util.inputinteger();
		System.out.println("Enter the ending number");
		int max=Algorithm_Util.inputinteger();
		System.out.println("Generated prime numbers between "+min+ " and "+ max+ "  are:");
		Algorithm_Util.isPrime(min, max);


	}

}
