package com.bridgelabs.functional_programs;

import com.bridgelabs.functionalutil.FunctionalUtil;

public class EuclidDistance {
	
	public static void main(String[] args)
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		double distance=FunctionalUtil.isDistance(x, y);
		
		System.out.println("The distance from ("+x+y+") to origin="+distance);
	}
  
}
