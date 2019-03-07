package com.bridgelabs.functional_programs;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class CouponNumber {

		public static void main (String[] args)
	{
        
		System.out.println("How many coupons do you want to be generated??");
		int n=FunctionalUtil.inputinteger();
		System.out.println("Distinct coupon numbers are:");
		FunctionalUtil.isCoupon(n);

	}
}
