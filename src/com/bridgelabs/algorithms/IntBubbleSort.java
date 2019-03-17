package com.bridgelabs.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class IntBubbleSort {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size: ");
		int n =scanner.nextInt();
		List<Integer> nos = new ArrayList<>();
		System.out.println("Enter elements:");

		for(int i=0;i<n;i++){
			nos.add(scanner.nextInt());
		}
		Algorithm_Util.bubble(nos, n); 
	}
}