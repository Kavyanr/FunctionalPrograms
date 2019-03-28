package com.bridgelabs.algorithms;

import com.bridgelabs.functionalutil.AlgorithmUtil;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Enter the temperature:" );
		double temperature=AlgorithmUtil.inputDouble();
		System.out.println("Enter your choice:");
		int choice=AlgorithmUtil.inputinteger();
		
		if(choice==1)
		      System.out.println("Converts Celsius to Fahrenheit: ");
		 if(choice==2)
		    	System.out.println("Converts Fahrenheit to Celsius:");
		AlgorithmUtil.temperatureConversion(temperature,choice);
		
	}

}
