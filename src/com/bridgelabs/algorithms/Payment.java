package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class Payment {

	public static void main(String[] args)
	{
		float P,Y,R;
		P=Float.parseFloat(args[0]);
		Y=Float.parseFloat(args[1]);
		R=Float.parseFloat(args[2]);
        Algorithm_Util.monthlyPayment(P, Y, R);
        

	}

}
