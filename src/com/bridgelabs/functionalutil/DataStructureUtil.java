package com.bridgelabs.functionalutil;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DataStructureUtil {
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

	public static int day(int month, int day, int year) {
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;
		return d;
	}

	// return true if the given year is a leap year
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		if (year % 400 == 0)
			return true;
		return false;
	}

	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	@SuppressWarnings("rawtypes")
	public static boolean areParenthesisBalanced(char[] ch) {

		StackImplementation st = new StackImplementation();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
				st.push(ch[i]);

			if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {

				if (st.isEmpty()) {
					return false;
				}

				else if (!isMatchingPair(st.pop(), ch[i])) {
					return false;
				}
			}

		}

		if (st.isEmpty())
			return true;
		else {
			return false;
		}
	}
	
	public static boolean ispallindrom(Dequeue<Character> dq) {
		if (dq.size() % 2 == 0) {
			while (dq.size() != 0) {
				char c = dq.removeFront();
				char c2 = dq.removeRear();
				if (c != c2) {
					return false;
				}
			}
		} else {
			while (dq.size() == 1) {
				char c = dq.removeFront();
				char c2 = dq.removeRear();
				if (c != c2) {
					return false;
				}
			}
		}
		return true;
	}
}
	
	
	
	