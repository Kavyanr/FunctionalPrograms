package com.bridgelabs.functionalutil;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


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

			//COUPON NUMBERS
			public static void isCoupon(int n)
			{
				int count=0,i=1;
				Random t= new Random();
				int j=t.nextInt(50);
				
				while( i<=n)
				{
					if( j!=t.nextInt(50))
					{
						System.out.println( t.nextInt(50));

						t.nextInt(50);
						count++;
					}
					i++;
				}
				System.out.println("Total number of coupons:  " + count);
				
			}
			
			//POWER OF 2
			public static int isPower(int n)
			{
				int power=1;
				if(n<31)
				{
					for(int i=0;i<=n;i++)
					{
						System.out.println("2^"+i+" = " + power);
						power = power * 2;
					}
				return	power;
				}
				else
					return 0;
			}
			
			//REPLACE
			public static void Username(String s2)
			 {
				 
				 if(s2.length()>=3)
					 System.out.println( "hello " + s2 + ", how was the day??");
				 else
					 System.out.println( "Invalid user");
			 }

			//HARMONIC PROGRESSION
			public static void Check_progression(int n)
			{
				if(n!=0)
				{
					for(int i=0;i<n;i++)
					{
						int num=1;
						int d=i+1;
						int result=(num/d);
						System.out.println(num+"/"+d);
					}
				}
			}

			//BRUTE FORCE
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

			//LEAP YEAR
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
			
			//FLIPCOIN
			public static void isflip (int flips)
			{
				double head=0,tail=0,i=0;
				Random rn=new Random();
				double n=rn.nextDouble();
				while(i<=flips) {
		            if(n<0.5) 
						tail++;
					else
						head++;
					i++;
				}
				System.out.println("Number of tails:" + tail);
				System.out.println("Number of heads:"+head);
				double percent=(tail/flips)*100;
				System.out.println("Tail percentage :" +percent);
				double percent1=(head/flips)*100;
				System.out.println("Head percentage :" +percent1);
			}

			//GAMBLER PROGRAM LOGIC
			public static void isGambler(int stake, int goal, int trials)
			{
			int tbet = 0;        // total number of bets made
		    int twin=0;       // total number of games won


			for (int i= 0; i < trials; i++) {
				int amt = stake;
				if(amt > 0 && amt < goal) 
				{
					tbet++;
					if (Math.random() < 0.5)
						amt++;     // win $1
						else                     
							amt--;

				}
				if (amt == goal) twin++; 

			}
			System.out.println(twin + " wins of " + trials);
			System.out.println("Percent of games won = " + 100.0 * twin / trials);
		}
			
			//QUADRATIC
			public static void isQuadratic(int a, int b, int c)
			{
				double root1,root2;
				double delta= b*b-4*a*c;
				if(delta>0)
				{
					root1= (-b+Math.sqrt(delta))/(2*a);
					root2= (-b-Math.sqrt(delta))/(2*a);
					System.out.println("The roots are distinct:" );
					System.out.println("Root1=" + root1 +"    Root2=" + root2);
					
				}
				else if(delta==0)
				{
					System.out.println("Roots are same:");
					root1=root2= -b/(2*a);
				}
				else
				{
					double real=(-b/(2*a));
					double imaginary= Math.sqrt(-delta)/(2*a);
					System.out.println("Roots are real and imaginary:");
					System.out.println("root1=" + real + "+i" + imaginary);
					System.out.println("root1=" + real + "-i" + imaginary);
				}
					
				
			}
			
			//STOP WATCH
			public static void Watch(long startTime, long endTime)
			{
					long timeElapsed = endTime - startTime;
					System.out.println("Execution time in milliseconds:" + timeElapsed/1000);
			}
		}

	


