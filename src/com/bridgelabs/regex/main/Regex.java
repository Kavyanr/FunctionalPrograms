package com.bridgelabs.regex.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabs.functionalutil.FileOperation;
import com.bridgelabs.functionalutil.OopsMethods;
import com.bridgelabs.regex.impl.RegexImpl;

public class Regex {
	public static void main(String[] args) {
		BufferedReader read = new BufferedReader(FileOperation.readFile("C:\\Users\\LENOVO\\kavya\\Regex.txt"));
		String message = "";
		String word = "";

		try {
			while ((word = read.readLine()) != null) {
				message = word;
			}
			System.out.println("Please enter the first name");
			String firstName = OopsMethods.inputString();
			System.out.println("Please enter the last name");
			String lastName = OopsMethods.inputString();
			String fullName = firstName + " " + lastName;
			System.out.println("Please enter your 10 digit phone number");
			String phoneNum = OopsMethods.inputString();

			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			String formattedDate = dateFormat.format(date);
			String messageReturn = RegexImpl.replace(firstName, fullName, phoneNum, formattedDate, message);

			System.out.println(messageReturn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}