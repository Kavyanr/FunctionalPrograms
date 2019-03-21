package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("Enter the amount:");
		int cash=Algorithm_Util.inputinteger();
		int[] notes= {1000,500,100,50,10,5,2,1};
		int sum=Algorithm_Util.vendingMachine(cash,notes);
         System.out.println("Total number of notes= "+ sum);
	}

}
