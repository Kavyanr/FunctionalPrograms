package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.AlgorithmUtil;

public class DecimaltoBinary {
	 public static void main(String[] args)
	 {
		 System.out.println("Enter the number:");
		 int num=AlgorithmUtil.inputinteger();
		 System.out.print("Binary representation of " + num + " --> " );
		 AlgorithmUtil.toBinary(num);
	 }

}
