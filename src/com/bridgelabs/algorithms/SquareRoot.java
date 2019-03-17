package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class SquareRoot {

	public static void main(String[] args) {
		
		int c=Integer.parseInt(args[0]);
		double root=Algorithm_Util.sqrt(c);
		System.out.println(root);
	}

}
