package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.AlgorithmUtil;

public class SwapNibbles {

	public static void main(String[] args) {
		System.out.println("Enter the number"); 
	    int number = AlgorithmUtil.inputinteger();
		int result=AlgorithmUtil.swapNibbles(number);
		System.out.println("Number after swapping nibbles " +result);
		boolean status=AlgorithmUtil.isPowerOfTwo(result);
		
		if(status==true)
			System.out.println("The result is a power of two");
		else
			System.out.println("The result is not a power of two");
		}
}
