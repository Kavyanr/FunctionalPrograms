package com.bridgelabs.functional_programs;
import com.bridgelabz.functionalutil.FunctionalUtil;

public class Flip {
	
		public static void main (String[] args)
		{
			double head=0,tail=0;
			System.out.println("Enter the value for flips:");
			int flips= FunctionalUtil.inputinteger();
			FunctionalUtil.isFlip(flips);
			System.out.println("Number of tails:" + tail);
			System.out.println("Number of heads:"+head);
			
		}

	}

