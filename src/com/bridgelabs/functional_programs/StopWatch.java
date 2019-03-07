package com.bridgelabs.functional_programs;

import com.bridgelabs.functionalutil.FunctionalUtil;
import java.util.concurrent.TimeUnit;

public class StopWatch {
	

		public static void main(String[] args)  throws InterruptedException{

			long startTime = System.currentTimeMillis();
		    System.out.println("start time=" + startTime);
		    TimeUnit.SECONDS.sleep(8);
		    long endTime = System.currentTimeMillis();
		     System.out.println("End time=" + endTime);
		     FunctionalUtil.Watch(startTime, endTime); 
			
		}
	}

