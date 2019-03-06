package com.bridgelabz.programs;

import java.util.Scanner;

public class BruteForce {
	
	public static void PrimeFactors(int n)
	{
		while(n%2==0)
		{
			System.out.println(2 + "  ");
			n=n/2;
		}
		
		
			for(int i=3;i*i<=n;i+=2)
			{
				while(n%i==0)
				{
					System.out.println(i + " ");
					n=n/i;
				}
			}
		
		if(n>2)
		{
			System.out.println(n);
		}
		
	}
  public static void main (String[] args)
  {

	  
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter n value");
	  int n=scanner.nextInt();
	  PrimeFactors(n);
	  
  }
}
