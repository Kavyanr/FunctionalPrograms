package com.bridgelabs.functionalutil;

import java.util.*;

public class Algorithm_Util {
	static Scanner scanner=new Scanner(System.in);

	public static int inputinteger() {
		return scanner.nextInt();

	}
	public static String inputString() {
		return scanner.nextLine();
	}
	public static double inputDouble() {
		return scanner.nextDouble();
	}

//ANAGRAM
	public static boolean areAnagram(String first,String second)
	{
		int i;
		if(first.length()!=second.length())
			return false;
		
		char[] s1=first.toCharArray();
		char[] s2=second.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		for(i=0;i<first.length();i++)
		{
		    if(s1[i]!=s2[i])
		    	return false;
		}
		return true;
		
	}
	//GENERATING PRIME NUMBERS
	public static int isPrime(int min, int max)
	{
		 int i,count,k=0,num=min;
		 int[] array=new int[max];
	   while(num <= max)
		{
			count = 0;
			i = 2;
		    while(i <= num/2 )
		    {
		    	if(num % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    	i++;
		    }
		    if(count == 0 && num != 1 )
		    {   System.out.print(num + " ");
		    k++;
		     }
		    num++;
		} 
	 return k;
	   	}
	
	//PALINDROME
	//public static void Palin(int[] arr)
	{
      //   int reverse=0;
		//for(int i=1;i<=arr.length;i++)
		{
			//int number=1;
			//while(number>0)
			{
				//int remainder=number%10;
			     //reverse=reverse*10+remainder;
			     //number=number/10;
			}
		//if(reverse==i)
			//System.out.print(number+ " ");
		}
		//reverse=0;
	}
	//INSERTION SORT FOR INTEGERS
	public static void insertint(int[] array) 
	{
		int i=0,j=0,w,temp;
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<=i;j++)
			{
				if(array[j]>array[i])
				{
					temp=array[j];
					array[j]=array[i];
					for(w=i;w>j+1;w--)
					    array[w]=array[w-1];	
                    array[w]=temp;
			}
		}
	}
		for(int kl:array)
			System.out.print(kl + " ");
	}
	//INSERTION SORT FOR STRING
	public static void insertString(String str)
	{
		char[] array=str.toCharArray();
		int i=0,j=0,w;
		char temp;
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<=i;j++)
			{
				if(array[j]>array[i])
				{
					 temp=array[j];
					array[j]=array[i];
					for(w=i;w>j+1;w--)
					    array[w]=array[w-1];	
                    array[w]=temp;
			}
		}
	}
		
		for(int kl=0;kl<array.length;kl++)
			System.out.println( array[kl]+" ");
		
	}
	//BUBBLE SORT FOR INTEGER
	
	public static void isBubble(int[] array,int n)
	{
		int i,temp;
		for( i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					 temp=array[j];
					 array[j]=array[j+1];
					 array[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(array[i] + " ");
		}
	}
	//BUBBLE SORT FOR STRING
	public static void isBubbleString(String str)
	{
		char[] array=str.toCharArray();
		char temp;
		int i,n=array.length;
		for( i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					 temp=array[j];
					 array[j]=array[j+1];
					 array[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(array[i] + " ");
		}
	}
	
	
	public static boolean isPalindrome(int[] array) {
		int length = array.length;
		for (int index = 0; index < array.length; index++) {
			// get the element from the start
			int start = array[index];
			// get corresponding element from end
			int end = array[--length];
			// check if elements till the middle have been compared
			if (length < index) {
				return true;
			}
			// if start element is not the same as end element, the array is not
			// palindrome
			if (start != end) {
				return false;
			}
		}
		// if the control reaches here, means all the elements were same 
	return true;
	}
	
	//BINARY SEARCH FOR INTEGERS
	public static int isBinaryInt(int[] arr,int low,int high,int key)
	{
		int mid = 0;
		while(low<=high)
		{
			 mid=(low+high)/2;
			if(arr[mid]>key)
				 low=mid+1;
			else if(arr[mid]>key)
				high=mid-1;
			else
			    return mid;

		}
		return -1;
		
	}
	
}

