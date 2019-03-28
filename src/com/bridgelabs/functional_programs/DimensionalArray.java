package com.bridgelabs.functional_programs;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class DimensionalArray {

	public static void main(String[] args) {
		
		
		System.out.println("Number of rows:");
		int m=FunctionalUtil.inputInteger();
		System.out.println("Number of columns:");
		int n=FunctionalUtil.inputInteger();
		System.out.println("Enter the array values:");
		
		FunctionalUtil.isDimension(m, n);
				
	}  

}
