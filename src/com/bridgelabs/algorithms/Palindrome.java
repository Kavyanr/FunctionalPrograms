package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class Palindrome {

	public static void main(String[] args) {
		System.out.print("Enter the starting number: ");
		int min=Algorithm_Util.inputinteger();
		System.out.print("Enter the ending number: ");
		int max=Algorithm_Util.inputinteger();
		System.out.println("Generated prime numbers between "+min+ " and "+ max+ "  are:");
		int result=Algorithm_Util.isPrime(min, max);
		System.out.println("Total number of elements:"+result);
		}
	}
