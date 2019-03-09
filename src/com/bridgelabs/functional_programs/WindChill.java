package com.bridgelabs.functional_programs;
import com.bridgelabs.functionalutil.FunctionalUtil;
public class WindChill {
	public static void main(String[] args) {
	        double t = Double.parseDouble(args[0]);
	        double v = Double.parseDouble(args[1]);
	       FunctionalUtil.isTemperature(t, v);
	        System.out.println("Temperature = " + t);
	        System.out.println("Wind speed  = " + v);
	       
	    }
}
