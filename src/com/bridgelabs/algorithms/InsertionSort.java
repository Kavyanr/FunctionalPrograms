package com.bridgelabs.algorithms;
import java.util.*;
import com.bridgelabs.functionalutil.Algorithm_Util;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class InsertionSort {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println("Give an input value");
		int input= Algorithm_Util.inputinteger();
		if(input==1)
			System.out.println("Perform Insertion sort operation for integers");
		if(input==2)
			System.out.println("Perform Insertion sort operation for String");
		switch(input)
		{
		case 1: 
		System.out.println("Enter array size:");
		int n=Algorithm_Util.inputinteger();
		int[] array=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			array[i]=Algorithm_Util.inputinteger();
		}
		System.out.println("Sorted array:");
		Algorithm_Util.insertint(array);
		break;
		case 2:
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the string :");
			String str=scanner.next();
			Algorithm_Util.insertString(str);
            break;
         default:
			break;
		}
		long endTime = System.nanoTime();
		long time=FunctionalUtil.Watch(startTime, endTime); 
		System.out.println("Execution time in nanoeconds:" + time +" ns");	

	}

}
