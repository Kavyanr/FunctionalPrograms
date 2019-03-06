package com.bridgelabz.programs;
import java.util.Scanner;
public class Harmonic {
	public static void Check_harmonic(int n)
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

	public static void main (String[] args)
	{
		int i,result;
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter n value");
		n=scanner.nextInt();

		Check_harmonic(n);

	}


}
