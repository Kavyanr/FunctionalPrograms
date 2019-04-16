package com.bridgelabs.functionalutil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static boolean areParenthesisBalanced(char[] ch) {

		StackLinkedList st = new StackLinkedList();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
				st.push(ch[i]);

			if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {

				if (st.isEmpty()) {
					return false;
				}

				else if (!isMatchingPair((char) st.pop(), ch[i])) {
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

	

	/**
	 * static function to print the prime numbers for the given range
	 * 
	 * @param m the integer that represents the lower bound of the range
	 * @param n the integer that represents the upper bound of the range
	 * @return list of integers that are prime numbers between the range
	 */
	public static List<Integer> primeNum2D(int m, int n) {
		List<Integer> lst = new ArrayList<Integer>();
		int temp;

		// swapping of bounds if the given lower bound is greater than upper bound
		if (m > n) {
			temp = m;
			m = n;
			n = temp;
		}
		int flag = 1;
		// try all the possible values from lower bound to upper bound
		// if the number has the factor then it must be checked within lower bound
		for (int i = m; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				// If the number is divisible by any of the number then
				// initializing flag to zero and break
				// else flag is initialized to one
				if (i % j == 0) {
					flag = 0;
					break;
				} else
					flag = 1;
			}
			// If the number is prime which is indicated by the flag,
			// then adds the number into an ArrayList.
			if (flag == 1)
				lst.add(i);
		}
		return lst;
	}

	public static double binomialCoeff(double n, double k) {
		int res = 1;
	    if (k > n - k) 
	        k = n - k;  
		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}
	
	public static double binaryCount(double n) {
		double c = binomialCoeff(2 * n, n);
		double count = c / (n + 1);
		return count;
}
	
	public static List<Integer> anagramPrime(List<Integer> new_lst){
		List<Integer> listOfAnagrams=new ArrayList<Integer>();
		for(int i=0;i<new_lst.size();i++){
			for(int j=i+1;j<new_lst.size();j++){
				if(AlgorithmUtil.Anagram(String.valueOf(new_lst.get(i)),String.valueOf( new_lst.get(j)))){
					listOfAnagrams.add(new_lst.get(i));
					listOfAnagrams.add(new_lst.get(j));
					System.out.println(new_lst.get(i)+"  "+new_lst.get(j));
				}
			}
		}
		return listOfAnagrams;
	}

	/**
	 * Function that prints the list of prime numbers that are anagram 
	 * 
	 * @param list of prime numbers that anagram 
	 */
	public static void printPrimeAndAnagram(List<List<Integer>> list)
	{
	    List<Integer> aList = new ArrayList<Integer>();
	    for (int i = 0; i < list.size(); i++) {
	        aList = list.get(i);
	        if (i == 0) {
	            System.out.println("Numbers which are prime and anagram are:"+aList.size());
	            System.out.println();
	            for (int j = 0; j < aList.size(); j++) {
	                System.out.print(aList.get(j) + " ");
	            }
	        } else {
	            System.out.println("Numbers which are prime but not anagram are:"+aList.size());
	            System.out.println();
	            for (int j = 1; j < aList.size(); j++) {
	                System.out.print(aList.get(j) + " ");
	            }
	        }
	        System.out.println();
	    }
	}
	}
	

