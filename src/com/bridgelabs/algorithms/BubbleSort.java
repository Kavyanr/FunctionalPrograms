package com.bridgelabs.algorithms;

import java.util.*;
import com.bridgelabs.functionalutil.Algorithm_Util;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class BubbleSort {

	public static <T> void main(String[] args) {
		long starttime = System.nanoTime();
		
        System.out.println("Enter the array size");
        int n=Algorithm_Util.inputinteger();
        System.out.println("Enter array elements:");
        String[] array=new String[n];
        for(int i=0;i<n;i++)
     	   array[i]=Algorithm_Util.inputString();
        System.out.println("Sorted array is:");
        Algorithm_Util.BubbleSort(array);
        
		long endTime = System.nanoTime();
		long elapsed_time = FunctionalUtil.Watch(starttime, endTime);
		System.out.println("The time taken to perform binary search operation is "+ elapsed_time+" ns");
       }
}
