package com.bridgelabs.functional_programs;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class CouponNumber {

	public static void main (String[] args)
	{
		System.out.println("How many coupons do you want to be generated??");
		int n=FunctionalUtil.inputInteger();
		System.out.println("Generated coupon numbers are:");
		int result=FunctionalUtil.isCoupon(n);
		System.out.println(result);
	}
}
