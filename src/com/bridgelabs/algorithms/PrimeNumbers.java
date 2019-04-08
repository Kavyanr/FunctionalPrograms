package com.bridgelabs.algorithms;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabs.functionalutil.AlgorithmUtil;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter the starting number");
		int min=AlgorithmUtil.inputinteger();
		System.out.println("Enter the ending number");
		int max=AlgorithmUtil.inputinteger();
		System.out.println("Generated prime numbers between "+min+ " and "+ max+ "  are:");
		List<Integer> list = new ArrayList<Integer>();
		list=AlgorithmUtil.isPrime(min, max);
		for (int kl : list)
			System.out.print(kl + " ");
	}
}
