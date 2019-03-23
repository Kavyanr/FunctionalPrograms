package com.bridgelabs.algorithms;
import com.bridgelabs.functionalutil.Algorithm_Util;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class BubbleSort {

	public static <T> void main(String[] args) {
		long starttime = System.nanoTime();
		
      
		long endTime = System.nanoTime();
		long elapsed_time = FunctionalUtil.Watch(starttime, endTime);
		System.out.println("The time taken to perform bubble sort operation is "+ elapsed_time+" ns");
       }
}
