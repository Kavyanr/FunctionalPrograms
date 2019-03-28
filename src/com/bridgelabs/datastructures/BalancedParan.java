
package com.bridgelabs.datastructures;

import com.bridgelabs.functionalutil.DataStructureUtil;
import com.bridgelabs.functionalutil.StackImplementation;

public class BalancedParan  
{ 
    public static void main(String[] args)  
    { 
    	 StackImplementation st=new StackImplementation(); 
    	 System.out.println("Enter expression: ");
    	String input=DataStructureUtil.inputString();
     char[] ch= input.toCharArray();
     
     
          if (DataStructureUtil.areParenthesisBalanced(ch)) 
            System.out.println("Balanced "); 
          else
            System.out.println("Not Balanced ");   
    } 
  
} 