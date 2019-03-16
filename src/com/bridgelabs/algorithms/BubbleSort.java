package com.bridgelabs.algorithms;

import java.util.Scanner;
import com.bridgelabs.functionalutil.Algorithm_Util;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class BubbleSort {

	public static void main(String[] args) {
		long starttime = System.nanoTime();
		System.out.println("Give an input value");
		int input= Algorithm_Util.inputinteger();
		if(input==1)
			System.out.println("Perform Insertion sort operation for integers");
		if(input==2)
			System.out.println("Perform Insertion sort operation for String");
		switch(input)
		{
		case 1:
        System.out.println("Enter the array size");
        int n=Algorithm_Util.inputinteger();
        System.out.println("Enter array elements:");
        int[] array=new int[n];
        for(int i=0;i<n;i++)
     	   array[i]=Algorithm_Util.inputinteger();
        System.out.println("Sorted array is:");
        Algorithm_Util.isBubble(array, n);
        break;
		case 2:
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the String :");
			String string= scanner.nextLine();
			System.out.println("Sorted array using Bubble sort algorithm :");
			Algorithm_Util.isBubbleString(string);
			break;
		default:
			break;
		}
		long endTime = System.nanoTime();
		long elapsed_time = FunctionalUtil.Watch(starttime, endTime);
		System.out.println("The time taken to perform binary search operation is "+ elapsed_time+" ns");
       }
}
