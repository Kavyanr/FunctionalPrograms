package com.bridgelabs.inventory.main;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabs.functionalutil.DataStructureUtil;
import com.bridgelabs.functionalutil.OopsMethods;
import com.bridgelabs.inventory.DataImpl.InventoryDataImpl;
import com.bridgelabs.inventory.data.InventoryManager;

public class InventoryMain {
	public static void main(String[] args) throws IOException, ParseException {
		InventoryManager inventaryImp = new InventoryDataImpl();

		while (true) {
			System.out.println("1.Add\n2.Calculate\n3.Remove\n4.Exit");
			System.out.println("Enter your choice: ");
			int Choice = DataStructureUtil.inputinteger();
			switch (Choice) {
			case 1:
				System.out.println("enter name");
				String name = DataStructureUtil.inputString();
				System.out.println("enter weight");
				int weight = DataStructureUtil.inputinteger();
				System.out.println("enter price");
				double price = OopsMethods.inputDouble();
				inventaryImp.add(name, weight, price);
				break;
			case 2:
				inventaryImp.calculateInventory();
				break;
			case 3:
				System.out.println("enter name to remove: ");
				name = DataStructureUtil.inputString();
				inventaryImp.remove(name);
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Please select valid choice");

			}
		}
	}
}
