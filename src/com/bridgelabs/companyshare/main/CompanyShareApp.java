package com.bridgelabs.companyshare.main;

import java.util.LinkedList;

import com.bridgelabs.companyshare.data.CompanyShareService;
import com.bridgelabs.companyshare.impl.CompanyShareServiceImpl;
import com.bridgelabs.companyshare.model.CompanyShare;
import com.bridgelabs.functionalutil.OopsMethods;

public class CompanyShareApp {

	public static void main(String[] args) {
		
		 CompanyShareService ref=new CompanyShareServiceImpl();
		 LinkedList<CompanyShare> shares = new LinkedList<>();
		ref.fileRead();
	     ref.add();
		System.out.println("enter the name you want to delet");
		String name=OopsMethods.inputString();
		ref.remove(name);
		ref.writeFile();
	}
}