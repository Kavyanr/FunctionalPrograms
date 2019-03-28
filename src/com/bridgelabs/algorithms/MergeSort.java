package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.AlgorithmUtil;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class MergeSort {

	public static void main(String[] args)  {
		int i;
		long startTime = System.nanoTime();
		System.out.println("Enter the array size:");
		int n=AlgorithmUtil.inputinteger();
		String[] array=new String[n];
		System.out.println("Enter the array elements:");
		for(i=0;i<n;i++)
		{
			array[i]=AlgorithmUtil.inputString();
		}
		AlgorithmUtil.merge(array);
		for(String sort:array)
			System.out.println(sort);
		long endTime = System.nanoTime();
		long elapsed_time = FunctionalUtil.Watch(startTime, endTime);
		System.out.println("The time taken to perform merge sort operation is "+ elapsed_time+" ns");

	}

}
