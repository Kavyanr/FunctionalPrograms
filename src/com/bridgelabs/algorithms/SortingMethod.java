package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class SortingMethod {

	public static <T> void main(String[] args)
	{
		System.out.println("Enter your choice");
		int choice=Algorithm_Util.inputinteger();
		System.out.print("Enter the array size:");
		int n=Algorithm_Util.inputinteger();
		System.out.println("Enter array elements: ");
		String [] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Algorithm_Util.inputString();
		}
		

		switch(choice)
		{
		case 1:
			System.out.println("Perform binary search");
			System.out.println("Sorted array:");
			Algorithm_Util.BubbleSort(arr);
			System.out.println("Enter the key:");
			String key=Algorithm_Util.inputString();
			long starttime=System.nanoTime();
			Algorithm_Util.BinarySearch(arr, key);
			long endTime = System.nanoTime();
			long elapsed_time = FunctionalUtil.Watch(starttime, endTime);
			System.out.println("The time taken to perform binary search operation is "+ elapsed_time+" ns");
			break;
		case 2:
			System.out.println("Perform bubble sort");
			System.out.println("Sorted array is:");
			long starttime1=System.nanoTime();
			Algorithm_Util.BubbleSort(arr);
			long endTime1 = System.nanoTime();
			long elapsed_time1 = FunctionalUtil.Watch(starttime1, endTime1);
			System.out.println("The time taken to perform bubble sorts operation is "+ elapsed_time1+" ns");
			break;

		case 3:
			System.out.println("Perform insertion sort");
			System.out.println("Sorted array:");
			long starttime11=System.nanoTime();
			Algorithm_Util.insertionSort(arr);
			long endTime11 = System.nanoTime();
			long elapsed_time11 = FunctionalUtil.Watch(starttime11, endTime11);
			System.out.println("The time taken to perform Insertion sort operation is "+ elapsed_time11+" ns");
			break;

		default:
			break;
		}

	}

}
