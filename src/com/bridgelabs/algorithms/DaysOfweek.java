package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class DaysOfweek {

	public static void main(String[] args) {
		
		int d=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		Algorithm_Util.dayOfWeek(d, m, y);
        
	}

}
