package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.AlgorithmUtil;

public class SquareRoot {

	public static void main(String[] args) {
		
		int c=Integer.parseInt(args[0]);
		double root=AlgorithmUtil.sqrt(c);
		System.out.println(root);
	}

}
