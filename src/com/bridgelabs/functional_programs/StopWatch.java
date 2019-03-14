package com.bridgelabs.functional_programs;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class StopWatch {
	

		public static void main(String[] args)   {

			long startTime = System.nanoTime();
		    System.out.println("start time=" + startTime);
		    
		    long endTime = System.nanoTime();
		     System.out.println("End time=" + endTime);
		     long time=FunctionalUtil.Watch(startTime, endTime); 
		     System.out.println("Execution time in nanoeconds:" + time +" ns");
		}
	}

