package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class InsertionSort {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
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
		long endTime = System.nanoTime();
		long time=FunctionalUtil.Watch(startTime, endTime); 
		System.out.println("Execution time in nanoeconds:" + time +" ns");	

	}

}
