package com.bridgelabz.programs;
import java.util.Scanner;




public class leap_year {

	public static void main(String[] args)
	{
		int year,n;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter the year");

		year=s.nextInt();
		Checkyear(year);
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
