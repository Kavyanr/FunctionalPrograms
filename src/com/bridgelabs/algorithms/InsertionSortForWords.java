package com.bridgelabs.algorithms;
import java.util.*;

import com.bridgelabs.functionalutil.Algorithm_Util;
public class InsertionSortForWords {

	public static void main(String args[]) {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter string: ");
	  int n=scanner.nextInt();
	 String[] str=new String[n];
	   System.out.println("Enter elements:");
	  
      for(int i=0;i<n;i++){
          str[i]=Algorithm_Util.inputString();
       }
      
      
	}

}
