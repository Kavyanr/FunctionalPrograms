package com.bridgelabz.programs;
import java.util.Random;

import java.util.Scanner;


public class FlipCoin {

	public static void main (String[] args)
	{
		double head=0,tail=0,i=0;
		int flips;
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		double n=rn.nextDouble();
		System.out.println("Enter the value for flips:");
		flips=sc.nextInt();
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

}
