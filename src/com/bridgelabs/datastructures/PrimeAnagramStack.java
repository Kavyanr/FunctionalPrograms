package com.bridgelabs.datastructures;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabs.functionalutil.AlgorithmUtil;
import com.bridgelabs.functionalutil.StackLinkedList;

public class PrimeAnagramStack {
	public static void main(String[] args) 
	{
	StackLinkedList<Integer> st=new  StackLinkedList<>();
	  
	  List<Integer> list1 = new ArrayList<Integer>();
	  
	  list1 = AlgorithmUtil.isPrime(0, 1000);
	
	  for(int i=0;i<list1.size();i++){
		  for(int j=i+1;j<list1.size();j++){
			  if(AlgorithmUtil.Anagram(String.valueOf(list1.get(i)),String.valueOf( list1.get(j)))){
				  st.push(list1.get(i));
				  st.push(list1.get(j));
			}
		}
	}
    System.out.println("Printing the elements in reverse order using pop function of stack");
    
    while(!st.isEmpty()){
    	
        System.out.println(st.pop()+" "+st.pop());
    }		   
}
		
		}


