package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class Questions {

	public static void main(String[] args) {
		System.out.println("Think of a number between 0 to 127!");
		int number= Algorithm_Util.inputinteger();
		int low=0; int high=127;
        int result=Algorithm_Util.find(low,high);
        System.out.println("The guessed number is " + result);
		}

}
