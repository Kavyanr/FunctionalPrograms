package com.bridgelabs.datastructures;

import com.bridgelabs.functionalutil.AlgorithmUtil;
import com.bridgelabs.functionalutil.FunctionalUtil;

public class Calendar
{ 
         public static void main(String[] args) {
	        int month = Integer.parseInt(args[0]);    
	        int year = Integer.parseInt(args[1]);    

	        String[] months = {
	            "",                              
	            "January", "February", "March",
	            "April", "May", "June",
	            "July", "August", "September",
	            "October", "November", "December"
	        };

	       
	        int[] days = {
	            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	        };

	        
	        if (month == 2 && FunctionalUtil.Checkyear(year)) days[month] = 29;


	        
	        System.out.println("   " + months[month] + " " + year);
	        System.out.println(" S  M Tu  W Th  F  S");

	       
	        int date= AlgorithmUtil.dayOfWeek(1,month,year);

	        
	        for (int i = 0; i < date; i++)
	            System.out.print("   ");
	        for (int i = 1; i <= days[month]; i++) {
	            System.out.printf("%2d ", i);
	            if (((i + date) % 7 == 0) || (i == days[month])) System.out.println();
	        }

	    }
	}
