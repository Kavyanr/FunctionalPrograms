package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Enter the temperature:" );
		double temperature=Algorithm_Util.inputDouble();
		System.out.println("Enter your choice:");
		int choice=Algorithm_Util.inputinteger();
		
		if(choice==1)
		      System.out.println("Converts Celsius to Fahrenheit: ");
		 if(choice==2)
		    	System.out.println("Converts Fahrenheit to Celsius:");
		Algorithm_Util.temperatureConversion(temperature,choice);
		
	}

}
