package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class BubbleString {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		String str=Algorithm_Util.inputString();
		System.out.println("Sorted array using Bubble sort algorithm :");
		Algorithm_Util.isBubbleString(str);


	}

}
