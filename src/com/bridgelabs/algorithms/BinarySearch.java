package com.bridgelabs.algorithms;
import java.util.*;
import com.bridgelabs.functionalutil.Algorithm_Util;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class BinarySearch {

	public static <T> void main(String[] args)
	{
		
		long starttime=System.nanoTime();
		System.out.print("Enter the array size:");
			int n=Algorithm_Util.inputinteger();
			System.out.print("Enter array elements: ");
			String [] arr=new String[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=Algorithm_Util.inputString();
			}
			System.out.print("Enter the key:");
			String key=Algorithm_Util.inputString();
			Algorithm_Util.BinarySearch(arr, key);
			
		long endTime = System.nanoTime();
		long elapsed_time = FunctionalUtil.Watch(starttime, endTime);
		System.out.println("The time taken to perform binary search operation is "+ elapsed_time+" ns");

	}
}


