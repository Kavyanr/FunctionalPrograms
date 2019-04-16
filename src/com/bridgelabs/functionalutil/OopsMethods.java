package com.bridgelabs.functionalutil;

import java.sql.Time;
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

	public static char inputChar() {
		return scanner.next().charAt(0);
	}

	public static String inputString() {
		return scanner.next();
	}
      public static String replace(String first, String fullName, String phoneNum, String date, String line) {
		final String REGEX_NAME = "<<name>>";
		final String REGEX_FULL_NAME = "<<full name>>";
		final String REGEX_CONTACT = "x{10}";
		final String REGEX_DATE = "<<01/01/2016>>";
		Pattern p1 = Pattern.compile(REGEX_NAME);
		Matcher m1 = p1.matcher(line);
		line = m1.replaceAll(first);

		Pattern p2 = Pattern.compile(REGEX_FULL_NAME);
		Matcher m2 = p2.matcher(line);
		line = m2.replaceAll(fullName);

		Pattern p3 = Pattern.compile(REGEX_CONTACT);
		Matcher m3 = p3.matcher(line);
		line = m3.replaceAll(phoneNum);
       
		Pattern p4 = Pattern.compile(REGEX_DATE);
		Matcher m4 = p4.matcher(line);
		line = m4.replaceAll(date);
		return line;
	}

}
