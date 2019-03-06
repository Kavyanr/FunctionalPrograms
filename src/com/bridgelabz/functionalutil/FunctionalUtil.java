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
	
	
	public static void Username(String s2)
	 {
		 
		 if(s2.length()>=3)
			 System.out.println(" ");
		 else
			 System.out.println("Invalid user");
	 }

	public static void isFlip(int flips)
	{
		double head=0,tail=0,i=0;
		Random rn=new Random();
		double n=rn.nextDouble();
		while(i<=flips)
		{

			if(n<0.5) 
				tail++;
			else
				head++;
			i++;
		}
	
}
	
	public static void Check_progression(int n)
	{
		if(n!=0)
		{
			for(int i=0;i<n;i++)
			{
				int numerator=1;
				int denominator=i+1;
				int result=(numerator/denominator);
				System.out.println(numerator+"/"+denominator);
			}
		}
	}

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
			System.out.println(n);
	
}

	public static void Checkyear(int year) {
		if (year>=1000)
		{
			if((year%400==0)||(year%4==0))
				System.out.println("Given year is a leap year");
             else if(year%100!=0)
            	 System.out.println("Given year is not a leap year");
		}
		else
			System.out.println("Enter 4 digit number");
}

}
