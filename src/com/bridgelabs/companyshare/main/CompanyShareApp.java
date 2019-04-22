package com.bridgelabs.companyshare.main;

import com.bridgelabs.companyshare.data.CompanyShareService;
import com.bridgelabs.companyshare.impl.CompanyShareServiceImpl;
import com.bridgelabs.functionalutil.DataStructureUtil;
import com.bridgelabs.functionalutil.OopsMethods;

public class CompanyShareApp {

	public static void main(String[] args) {
		
		 CompanyShareService object=new CompanyShareServiceImpl();
		 while (true) {
				System.out.println("1.Add\n2.Remove\n3.Exit");
				System.out.println("Enter your choice: ");
				int Choice = DataStructureUtil.inputinteger();
				switch (Choice) {
				case 1:
				System.out.println("enter company name to add");
				String companyName = OopsMethods.inputString();
				System.out.println("enter the number of share");
				Long numberOfShares = OopsMethods.inputLong();
				object.add(companyName, numberOfShares);
				break;
				case 2:
					System.out.println("enter the name you want to delete");
					String name=OopsMethods.inputString();
					object.remove(name);
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Please enter valid input:");
				}
				
	    
		 }
	}
}