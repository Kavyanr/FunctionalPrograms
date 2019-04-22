package com.bridgelabs.inventory.data;

public interface InventoryManager {
	public double calculate(double price);

	public void writeFile();

	public void add(String name, double weight, double price);

	public void remove(String name);

	public void calculateInventory();
}
