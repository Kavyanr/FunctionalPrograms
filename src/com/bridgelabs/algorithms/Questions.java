package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.AlgorithmUtil;

public class Questions {

	public static void main(String[] args) {
		System.out.println("Think of a number between 0 to 127!");
		int number= AlgorithmUtil.inputinteger();
		int low=0; int high=127;
        int result=AlgorithmUtil.findGuessNumber(low,high);
        System.out.println("The guessed number is " + result);
		}

}
