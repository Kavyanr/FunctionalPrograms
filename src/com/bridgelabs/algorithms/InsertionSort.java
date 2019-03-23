package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class InsertionSort {

	public static <T> void main(String[] args) {
		long startTime = System.nanoTime();
		
		System.out.println("Enter array size:");
		int n=Algorithm_Util.inputinteger();
		String[] array=new String[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			array[i]=Algorithm_Util.inputString();
		}
		System.out.println("Sorted array:");
		Algorithm_Util.insertionSort(array);
		long endTime = System.nanoTime();
		long elapsed_time = FunctionalUtil.Watch(startTime, endTime);
		System.out.println("The time taken to perform Insertion sort operation is "+ elapsed_time+" ns");
	}

}
