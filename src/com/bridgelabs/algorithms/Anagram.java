package com.bridgelabs.algorithms;
import com.bridgelabs.functionalutil.Algorithm_Util;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter the first string:");
		String str1=Algorithm_Util.inputString();
		System.out.println("Enter the second string:");
		String str2=Algorithm_Util.inputString();
		boolean status=Algorithm_Util.isAnagram(str1, str2);
		if(status)
			System.out.println("Given strings are anagrams ");
		else
			System.out.println("Given strings are not anagrams ");
	}

}
