package com.bridgelabs.functional_programs;
import com.bridgelabs.functionalutil.FunctionalUtil;
import java.util.concurrent.TimeUnit;

public class StopWatch {
	

		public static void main(String[] args) throws InterruptedException  {

			long startTime = System.currentTimeMillis();
		    System.out.println("start time=" + startTime);
		     TimeUnit.SECONDS.sleep(6);
		    long endTime = System.currentTimeMillis();
		     System.out.println("End time=" + endTime);
		     long time=FunctionalUtil.Watch(startTime, endTime); 
		     System.out.println("Execution time in milliseconds:" + time);
		}
	}

