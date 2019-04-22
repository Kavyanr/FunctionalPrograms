package com.bridgelabs.stock.main;

import java.util.Scanner;

import com.bridgelabs.stock.data.StockInterface;
import com.bridgelabs.stock.implementation.StockImplementation;

public class StockMain {

	public static void main(String[] args) {

		StockInterface stockImp = new StockImplementation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Add Share\n2.Calculate each Share\n3.Total value of shares\n4.Exit");
			System.out.println("Enter Choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter name :");
				String shareName = sc.next();
				System.out.println("Enter number of shares:");
				int noOfShare = sc.nextInt();
				System.out.println("Enter price");
				double sharePrice = sc.nextDouble();
				stockImp.addStock(shareName, noOfShare, sharePrice);
				break;
			case 2:
				stockImp.calculateStock();
				break;
			case 3:
				stockImp.calculateTotalStock();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Please Enter Valid Choice: ");
			}
		}
	}

}