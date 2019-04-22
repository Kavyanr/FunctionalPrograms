package com.bridgelabs.address.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabs.address.data.AddressBookService;
import com.bridgelabs.address.implementation.AddressBookServiceImplementation;
import com.bridgelabs.functionalutil.DataStructureUtil;
import com.bridgelabs.functionalutil.OopsMethods;

public class AddressBookApp {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		AddressBookService details=new AddressBookServiceImplementation();
		
		System.out.println("Enter 1-->add person \t  2-->remove person \t 3-->Sort by last name \t 4-->sort by zipcode :" );
		int input=DataStructureUtil.inputinteger();
		switch(input)
		{
		case 1 :{
			
		
			System.out.println("Enter first name : ");
			String firstName=DataStructureUtil.inputString();
			System.out.println("Enter last name : ");
			String lastName=DataStructureUtil.inputString();
			System.out.println("Enter address : ");
			String address=DataStructureUtil.inputString();
			System.out.println("Enter city name : ");
			String city=DataStructureUtil.inputString();
			System.out.println("Enter state name : ");
			String state=DataStructureUtil.inputString();
			System.out.println("Enter phone number : ");
			Long phoneNumber=OopsMethods.inputLong();
			System.out.println("Enter zipcode : ");
			Long zipCode=OopsMethods.inputLong();
			
			details.addPerson(firstName, lastName, zipCode, phoneNumber, city, state, address);
			break;
		}
		case 2:{
			details.removePerson();
			break;
		}
		case 3:
		{
			details.sortByLastName();
			break;
		}
		case 4:
		{
			details.sortByZipCode();
			break;
		}
		default:
			break;
		}
		
	}

}
