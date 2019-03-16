package com.bridgelabs.algorithms;
import java.util.*;
import com.bridgelabs.functionalutil.Algorithm_Util;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class BinarySearch {

	public static void main(String[] args)
	{
		System.out.println("Give an input value");
		int input= Algorithm_Util.inputinteger();
		if(input==1)
			System.out.println("Perform binary search operation for integers");
		if(input==2)
			System.out.println("Perform binary search operation for String");
		long starttime=System.nanoTime();
		switch(input)
		{
		case 1:
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
			Algorithm_Util.isBinaryInt(arr, low, high,key);
			break;

		case 2:
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the String :");
			String string= scanner.nextLine();
			System.out.println("Enter the key");
			char value=Algorithm_Util.inputChar();
			int length=string.length();
			low=0;
			high=length-1;
			Algorithm_Util.isBinaryString(string, low, high, value);
			break;

		default:
			break;
		}
		long endTime = System.nanoTime();
		long elapsed_time = FunctionalUtil.Watch(starttime, endTime);
		System.out.println("The time taken to perform binary search operation is "+ elapsed_time+" ns");

	}
}


