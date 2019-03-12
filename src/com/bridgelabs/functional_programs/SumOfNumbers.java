package com.bridgelabs.functional_programs;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
          System.out.println("Enter array size:");
          int size=FunctionalUtil.inputinteger();
          int a[]= new int[size];
          System.out.println("Enter array elements");
          for(int i=0;i<size;i++)
          {
        	  a[i]=FunctionalUtil.inputinteger();
          }
          FunctionalUtil.isTriplets(a, size, 0);
          
	}

}
