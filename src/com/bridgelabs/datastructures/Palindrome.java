package com.bridgelabs.datastructures;

import com.bridgelabs.functionalutil.DataStructureUtil;
import com.bridgelabs.functionalutil.Dequeue;
public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter string: ");
		String s1=DataStructureUtil.inputString();
		Dequeue<Character> dq = new Dequeue<>();
		int i = 0;
		while (i < s1.length()) {
			dq.addRear(s1.charAt(i++));
		}
		System.out.println(dq + " " + dq.size());
		System.out.println(DataStructureUtil.ispallindrom(dq));
	}

}
