package com.bridgelabs.oops;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabs.functionalutil.OopsMethods;



public class Regex {
	
	/*
	* The main function is written to take input from the user and
	* replace the template in the json file with the input given
	*/
	public static void main(String[] args) throws FileNotFoundException {
		String str = "C:\\Users\\LENOVO\\kavya\\Regex.txt";
	        FileReader f = new FileReader("C:\\Users\\LENOVO\\kavya\\Regex.txt");
	        @SuppressWarnings("resource")
	        BufferedReader read = new BufferedReader(f);
	        String line = "";
	        String word="";
	        try {
	            while ((word = read.readLine()) != null) {
	                line = word;
	            }
	            System.out.println(line);
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println("Please enter the first name");
	        String firstName = OopsMethods.inputString();
	        System.out.println("Please enter the last name");
	        String lastName = OopsMethods.inputString();
	        String fullName = firstName + " " + lastName;
	        System.out.println("Please enter your 10 digit phone number");
	        String phoneNum = OopsMethods.inputString();
	        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        Date date=new Date();
	        String formattedDate= dateFormat.format(date);
	       
	        String message =OopsMethods.replace(firstName, fullName, phoneNum, formattedDate, line);
	        
	        System.out.println(message);
	        DateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
	        Date dat=new Date();
	        System.out.println(formatDate.format(dat));
	}
}