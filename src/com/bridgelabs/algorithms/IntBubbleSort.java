package com.bridgelabs.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabs.functionalutil.AlgorithmUtil;

public class IntBubbleSort {

	public static void main(String[] args)
	{
		System.out.println("Enter size: ");
		int n =AlgorithmUtil.inputinteger();
		List<Integer> nos = new ArrayList<>();
		System.out.println("Enter elements:");

		for(int i=0;i<n;i++){
			nos.add(AlgorithmUtil.inputinteger());
		}
		AlgorithmUtil.bubble(nos, n); 
	}
}