package com.bridgelabs.functional_programs;

import com.bridgelabs.functionalutil.FunctionalUtil;

public class StringReplace {
	public static void main(String[] args)
	{
		String s1="Hello <<username>>, How are you??";
		System.out.println("Original string:"+s1);
		System.out.println("Enter the name u want to be replaced");
		String user=FunctionalUtil.inputString();
		System.out.println(FunctionalUtil.Username(s1,user));
	}
}
