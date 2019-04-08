package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.AlgorithmUtil;

public class DaysOfweek {

	 public static void main(String[] args)
	    {
	                int d=Integer.parseInt(args[0]);
	                int m=Integer.parseInt(args[1]);
	                int y=Integer.parseInt(args[2]);
	                AlgorithmUtil.dayOfWeek(d, m, y);
	                System.out.println("Day is " + AlgorithmUtil.dayOfWeek(d, m, y));
	    }
	    

}
