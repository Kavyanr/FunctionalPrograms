package com.bridgelabs.functional_programs;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class DimensionalArray {

	public static void main(String[] args) {
		
		
		System.out.println("Number of rows:");
		int m=FunctionalUtil.inputinteger();
		System.out.println("Number of columns:");
		int n=FunctionalUtil.inputinteger();
		System.out.println("Enter the array values:");
		
		FunctionalUtil.isDimension(m, n);
				
	}  

}
