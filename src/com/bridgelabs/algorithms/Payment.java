package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.AlgorithmUtil;

public class Payment {

	public static void main(String[] args)
	{
		float P,Y,R;
		P=Float.parseFloat(args[0]);
		Y=Float.parseFloat(args[1]);
		R=Float.parseFloat(args[2]);
        AlgorithmUtil.monthlyPayment(P, Y, R);
        

	}

}
