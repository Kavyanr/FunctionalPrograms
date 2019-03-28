package com.bridgelabs.algorithms;
import com.bridgelabs.functionalutil.AlgorithmUtil;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter the starting number");
		int min=AlgorithmUtil.inputinteger();
		System.out.println("Enter the ending number");
		int max=AlgorithmUtil.inputinteger();
		System.out.println("Generated prime numbers between "+min+ " and "+ max+ "  are:");
		AlgorithmUtil.isPrime(min, max);
	}
}
