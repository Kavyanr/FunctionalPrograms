package com.bridgelabs.algorithms;
import com.bridgelabs.functionalutil.AlgorithmUtil;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter the first string:");
		String str1=AlgorithmUtil.inputString();
		System.out.println("Enter the second string:");
		String str2=AlgorithmUtil.inputString();
		boolean status=AlgorithmUtil.isAnagram(str1, str2);
		if(status)
			System.out.println("Given strings are anagrams ");
		else
			System.out.println("Given strings are not anagrams ");
	}

}
