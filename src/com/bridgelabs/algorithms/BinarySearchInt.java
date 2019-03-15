package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class BinarySearchInt {

	public static void main(String[] args) {
		System.out.print("Enter the array size:");
		int n=Algorithm_Util.inputinteger();
		System.out.print("Enter array elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
            arr[i]=Algorithm_Util.inputinteger();
		}
		int low=0,high=n-1;
		System.out.print("Enter the key:");
		int key=Algorithm_Util.inputinteger();
		int result=Algorithm_Util.isBinaryInt(arr, low, high,key);
		System.out.print("Key element found at"+ result);
	}

}
