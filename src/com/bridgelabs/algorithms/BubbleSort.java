package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class BubbleSort {

	public static void main(String[] args) {
           System.out.println("Enter the array size");
           int n=Algorithm_Util.inputinteger();
           System.out.println("Enter array elements:");
           int[] array=new int[n];
           for(int i=0;i<n;i++)
        	   array[i]=Algorithm_Util.inputinteger();
           System.out.println("Sorted array is:");
           Algorithm_Util.isBubble(array, n);
	}

}
