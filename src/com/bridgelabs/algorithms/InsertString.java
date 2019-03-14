package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class InsertString {

	public static void main(String[] args) {
		//Input for string sorting
		long startTime = System.nanoTime();
		System.out.println("Enter the string :");
		String str=Algorithm_Util.inputString();
		Algorithm_Util.insertString(str);
	
		long endTime = System.nanoTime();
		long time=FunctionalUtil.Watch(startTime, endTime); 
		System.out.println("Execution time in nanoeconds:" + time +" ns");

	}

}
