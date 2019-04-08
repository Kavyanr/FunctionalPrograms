package com.bridgelabs.functionalutil;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FunctionalUtil {

	static Scanner scanner=new Scanner(System.in);

	public static int inputInteger() {
		return scanner.nextInt();

	}
	public static String inputString() {
		return scanner.nextLine();
	}
	public static double inputDouble() {
		return scanner.nextDouble();
	}

	//COUPON NUMBERS
	public static int isCoupon(int n)
	{
		int count=0,i=0,j=0;
		int a[]=new int[n];
		Random t= new Random();

		for(i=0;i<n;i++)
		{
			a[i]=t.nextInt(n);
			System.out.println(a[i] + " ");
		}

		System.out.print("Number of distinct coupons:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
				if(a[i]==a[j])
					break;
			if(i==j)
				count++;
		}
		return count;
	}



	//REPLACE
	public static String Username(String s1,String user)
	{
		final String username="<<username>>";
		Pattern p=Pattern.compile(username);
		Matcher m=p.matcher(s1);
		String result=m.replaceFirst(user);
		return result;
	}

	//HARMONIC PROGRESSION
	public static void checkProgression(int n)
	{
		float sum=0;
		if(n!=0)
		{
			for(int i=1;i<=n;i++)
			{
				sum=sum+(float)1/i;
			}
			System.out.println(sum);
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
	public static boolean Checkyear(int year) {
		boolean flag=false;
		if (year>=1000)
		{
			if((year%400==0)||(year%4==0)&& (year%100!=0))
		         return true;
			else 
				return flag;
		}
		else
			System.out.println("Enter 4 digit number");
	return true;
	}

	//FLIPCOIN
	public static void isflip (int flips)
	{
		double head=0,tail=0,i=0;
		Random rn=new Random();
		double n=rn.nextDouble();
		if(flips>0)
		{
			while(i<flips) {
				if(n<0.5) 
					tail++;
				else
					head++;
				i++;
			}
		}
		System.out.println("Number of tails:" + tail);
		System.out.println("Number of heads:"+head);
		double percent=(tail/flips)*100;
		System.out.println("Tail percentage :" +percent +"%");
		double percent1=(head/flips)*100;
		System.out.println("Head percentage :" +percent1+"%");
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
	public static long Watch(long startTime, long endTime)
	{
		long timeElapsed = endTime - startTime;
		return timeElapsed;

	}

	//2d array

	public static void isDimension(int m,int n)
	{
		int i,j,a[][]=new int[20][20];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=FunctionalUtil.inputInteger();
			}
		}
		System.out.println("matrix form:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	//TRIPLETS
	public static void isTriplets(int a[],int n,int sum)
	{
		int i,j,k;
		for(i=0;i<n-2;i++)
		{
			for(j=i+1;j<n-1;j++)
			{
				for(k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==sum)
						System.out.println("["+a[i]+" " +a[j]+ " " + a[k]+"]");
				}
			}
		}


	}

	//EUCLIDEAN DISTANCE 
	public static double isDistance(int x,int y)
	{

		double distance= (Math.sqrt((x*x)+(y*y)));
		return distance;
	}

	//WIND CHILL
	public static void isTemperature(double t, double v)
	{

		double w= 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
		System.out.println("Wind chill  = " + w);

	}


	//POWER OF 2
	public static void isPower(int n) {

		int i = 0;
		int power = 1;

		System.out.println("Powers of 2 that are less than or equal to 2^"+n);
		if(n<31)
		{
			while (i <= n)
			{
				System.out.println("2^"+i+" = " + power);
				power = power * 2;
				i++;
			}
		}
	}

	//PERMUTATION
	public static void permutation(String input){
		permutation("", input);
	}


	private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			System.err.println(perm + word);

		} else {
			for (int i = 0; i <word.length(); i++) {
				permutation(perm + word.charAt(i), word.substring(0, i) 
						+ word.substring(i + 1, word.length()));
			}
		}

	}
}






