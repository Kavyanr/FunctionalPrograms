package com.bridgelabs.inventorymanagement.main;

import java.io.FileNotFoundException;

import com.bridgelabs.inventorymanagement.data.InventoryManagementService;
import com.bridgelabs.inventorymanagement.impl.InventoryManagementServiceImplementation;

public class InventoryManagementApp {

	public static void main(String[] args) throws FileNotFoundException {
		InventoryManagementService invent=new InventoryManagementServiceImplementation();
		invent.calculateInventoryPrice();

	}

}
