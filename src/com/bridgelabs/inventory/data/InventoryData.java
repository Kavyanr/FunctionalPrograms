package com.bridgelabs.inventory.data;

import java.io.IOException;

public interface InventoryData {
	

	public void fileRead();
	public double calculate(double price);
	public void writeFile();
	public void add(String name, double weight, double price);
	public void remove(String name);
	public void calculateInventory();
}
