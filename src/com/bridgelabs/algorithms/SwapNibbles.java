package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class SwapNibbles {

	public static void main(String[] args) {
		System.out.println("Enter the number"); 
	    int number = Algorithm_Util.inputinteger();
		int result=Algorithm_Util.swapNibbles(number);
		System.out.println("Number after swapping nibbles " +result);
		boolean status=Algorithm_Util.isPowerOfTwo(result);
		
		if(status==true)
			System.out.println("The result is a power of two");
		else
			System.out.println("The result is not a power of two");
		}
}
