package com.bridgelabs.datastructures;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabs.functionalutil.AlgorithmUtil;

public class PrimeNum2D {
	public static void main(String[] args) {
			List<List<Integer>> a1 =new ArrayList<List<Integer>>();
			int start=0;
			int end=100;
			for(int i=0;i<10;i++){
				List<Integer> listofPrimeNumbers = AlgorithmUtil.isPrime(start, end);
				
				a1.add(listofPrimeNumbers);
				start+=100;
				end+=100;
			}
			for(int i =0; i<a1.size(); i++){
				List<Integer>  primeNumbers = a1.get(i);
				for(int j=0; j<primeNumbers.size(); j++){
					System.out.print(primeNumbers.get(j)+" ");
				}
				System.out.println();
			}
		}
		
}