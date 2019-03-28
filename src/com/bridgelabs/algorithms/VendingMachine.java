package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.AlgorithmUtil;

public class VendingMachine {
	 public static void main(String[] args) {
	        
         
         int []notes= {1, 2, 5, 10, 50, 100, 500, 1000};
         System.out.println("enter money");
         int money=AlgorithmUtil.inputinteger();
         AlgorithmUtil.vendingMachine(money, notes);
         
     }
	

}
