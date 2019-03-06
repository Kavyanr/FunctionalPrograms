package com.bridgelabs.functional_programs;
import java.util.*;

import com.bridgelabz.functionalutil.FunctionalUtil;

public class CouponNumber {

		public static void main (String[] args)
	{

		System.out.println("How many coupons do you want to be generated??");
		int n=FunctionalUtil.inputinteger();
		FunctionalUtil.isCoupon(n);


	}
}
