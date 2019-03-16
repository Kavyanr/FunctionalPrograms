package com.bridgelabs.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class IntBubbleSort {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size: ");
		int n =scanner.nextInt();
		ArrayList<Integer> arrList = new ArrayList<Integer>(n);
		System.out.println("Enter elements:");

		for(int i=0;i<n;i++){
			arrList.add(scanner.nextInt());
		}
		Algorithm_Util.bubble(arrList,n);

	}
}