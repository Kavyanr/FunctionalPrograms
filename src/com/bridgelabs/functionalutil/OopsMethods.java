package com.bridgelabs.functionalutil;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OopsMethods {

	static Scanner scanner = new Scanner(System.in);

	public static int inputinteger() {
		return scanner.nextInt();
	}

	public static double inputDouble() {
		return scanner.nextDouble();
	}

	public static long inputLong() {
		return scanner.nextLong();
	}

	public static char inputChar() {
		return scanner.next().charAt(0);
	}

	public static String inputString() {
		return scanner.next();
	}

	
}
