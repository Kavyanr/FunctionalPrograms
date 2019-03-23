package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class MergeSort {

	public static void main(String[] args)  {
		int i;
		long startTime = System.nanoTime();
		System.out.println("Enter the array size:");
		int n=Algorithm_Util.inputinteger();
		String[] array=new String[n];
		System.out.println("Enter the array elements:");
		for(i=0;i<n;i++)
		{
			array[i]=Algorithm_Util.inputString();
		}
		Algorithm_Util.merge(array);
		for(String sort:array)
			System.out.println(sort);
		long endTime = System.nanoTime();
		long elapsed_time = FunctionalUtil.Watch(startTime, endTime);
		System.out.println("The time taken to perform merge sort operation is "+ elapsed_time+" ns");

	}

}
