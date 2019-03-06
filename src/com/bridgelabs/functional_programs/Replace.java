package com.bridgelabz.programs;

import java.util.Scanner;


public class Replace {
	 public static void main(String[] args)
	 {
		 
		String s1;
		 Scanner user = new Scanner(System.in);
		 
		 System.out.println("Enter the username");
		 s1=user.nextLine();
		 System.out.println("Enter the name u want to be replaced");
		 String s2=user.nextLine();
		 
		 Username(s2);
	 	 }

	 public static void Username(String user)
	 {
		 
		 if(user.length()>=3)
			 System.out.println("hello"  + " " +user+" " + "," +  "how was the day??");
		 else
			 System.out.println("Invalid user");
	 }
	 
	 
	 
}
