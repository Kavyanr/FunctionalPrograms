
package com.bridgelabs.datastructures;

import com.bridgelabs.functionalutil.DataStructureUtil;
import com.bridgelabs.functionalutil.StackLinkedList;

public class BalancedParan  
{ 
    @SuppressWarnings("rawtypes")
	public static void main(String[] args)  
    { 
    	 @SuppressWarnings("unused")
		StackLinkedList st=new StackLinkedList(); 
    	 System.out.println("Enter expression: ");
    	String input=DataStructureUtil.inputString();
     char[] ch= input.toCharArray();
     
     
          if (DataStructureUtil.areParenthesisBalanced(ch)) 
            System.out.println("Balanced "); 
          else
            System.out.println("Not Balanced ");   
    } 
  
} 