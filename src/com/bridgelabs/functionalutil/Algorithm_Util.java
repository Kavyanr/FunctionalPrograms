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
		    {
		    	System.out.print(num +" ");
				k++;
		    }
		    num++;
		}
	   return k;
	
	}
	
	//PALINDROME
	public static void isPalindrome(int min,int max)
	{
         int reverse=0;
		for(int i=min;i<=max;i++)
		{
			int number=min;
			while(number>0)
			{
				int remainder=number%10;
			     reverse=reverse*10+remainder;
			     number=number/10;
			}
		if(reverse==i)
			System.out.print(number+ " ");
		}
		reverse=0;
	}
	
}
