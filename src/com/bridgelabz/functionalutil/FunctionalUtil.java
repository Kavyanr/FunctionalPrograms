package com.bridgelabz.functionalutil;

import java.util.Random;
import java.util.Scanner;

public class FunctionalUtil {

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

	
	public static void isCoupon(int n)
	{
		int count=0;
		Random t= new Random();
		int j=t.nextInt(50);
		System.out.println("Distinct coupon numbers are:");
		for(int i=1; i<=n;i++)
		{



			if( j!=t.nextInt(50))
			{
				System.out.println( t.nextInt(50));

				t.nextInt(50);
				count++;
			}
		}
		System.out.println("Total number of coupons:  " + count);
	}
	
	public static int isPower(int n)
	{
		int power=1,i=0;
		if(n<31)
		{
			while (i <= n)
			{
				System.out.println("2^"+i+" = " + power);
				power = power * 2;
				i++;
			}
		return	power;
		}
		else
			return 0;
	}

	
}
