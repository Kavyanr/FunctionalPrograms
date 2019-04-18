package com.bridgelabs.stock.main;

import java.util.Scanner;

import com.bridgelabs.stock.data.StockInterface;
import com.bridgelabs.stock.implementation.StockImplementation;

public class StockMain {
	

	public static void main(String[] args) {
		//String stockName = null;
		//double noOfShare = 0;
		//double sharePrice = 0;
		StockInterface stockImp = new StockImplementation();

		Scanner sc = new Scanner(System.in);
	stockImp.readFile();
		System.out.println("enter name :");
		String shareName = sc.next();
		
		System.out.println("enter number of shares:");
		int noOfShare = sc.nextInt();
		
		System.out.println("enter price");
		double sharePrice = sc.nextDouble();
		

	   stockImp.addStock(shareName, noOfShare, sharePrice);
	    stockImp.calculateStock();
		stockImp.writeFile();
		stockImp.calculateTotalStock();
	}

}