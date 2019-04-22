package com.bridgelabs.inventorymanagement.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabs.functionalutil.FileOperation;
import com.bridgelabs.inventorymanagement.data.InventoryManagementService;
import com.bridgelabs.inventorymanagement.model.InventoryManagement;
import com.bridgelabs.inventorymanagement.model1.Inventory;
import com.google.gson.Gson;

public class InventoryManagementServiceImplementation implements InventoryManagementService{
	
	JSONObject jsonObject=new JSONObject();
	private List<Inventory> riceItems;
	private List<Inventory> wheatItems;
	private List<Inventory> pulseItems;
    JSONArray jsonArray;
	private Gson gson;

	public InventoryManagementServiceImplementation() {
		fileRead();
		this.gson = new Gson();
	}

	private void fileRead() {
		JSONParser parser = new JSONParser();
		try {
			String path="C:\\Users\\LENOVO\\eclipse-workspace\\Bridgelabz\\src\\com\\bridgelabs\\inventorymanagement\\model\\InventoryManagement.json";
			jsonObject = (JSONObject) parser.parse(FileOperation.readFile(path));
			jsonArray=(JSONArray) jsonObject.get("inventories");
			for (Object obj : jsonArray) {
			jsonObject = (JSONObject) obj;
			JSONArray riceArray = (JSONArray) jsonObject.get("rice");
			riceItems = getInventories(riceArray);
			JSONArray wheatArray = (JSONArray) jsonObject.get("wheat");
			wheatItems = getInventories(wheatArray);
			JSONArray pulseArray = (JSONArray) jsonObject.get("pulses");
			pulseItems = getInventories(pulseArray);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

		
	
private List<Inventory> getInventories(JSONArray array) {
	List<Inventory> inventories = new ArrayList<>();
	for (Object object : array) {
		Inventory inventory = new Inventory((JSONObject) object);
		inventories.add(inventory);
	}
	return inventories;
}
 

	public void addInventory(String name, int weight, double price) {
		Inventory inventory = new Inventory();
		inventory.setName(name);
		inventory.setWeight(weight);
		inventory.setPrice(price);
		riceItems.add(inventory);
		wheatItems.add(inventory);
		pulseItems.add(inventory);
		riceItems.forEach(inventory1 -> System.out.println(inventory1.toString()));
	}

public void calculateInventoryPrice() {
	double totalValueOfRice = getTotalValue(riceItems);
	double totalValueOfWheat = getTotalValue(wheatItems);
	double totalValueOfPulses = getTotalValue(pulseItems);
	System.out.println("Total value of rice is :- " + totalValueOfRice);
	System.out.println("Total value of wheat is :- " + totalValueOfWheat);
	System.out.println("Total value of pulses is :- " + totalValueOfPulses);
	writeInventoryToFile();
	
}

private double getTotalValue(List<Inventory> items) {
	double totalValueOfItem = 0.0;
	for (Inventory inventory : items) {
		totalValueOfItem += inventory.getCalculatedValue();
	}
	return totalValueOfItem;
}

private void writeInventoryToFile() {
	try {
		InventoryManagement factory = new InventoryManagement(riceItems, wheatItems, pulseItems);
		String json = gson.toJson(factory);
		FileWriter file = new FileWriter("C:\\Users\\LENOVO\\eclipse-workspace\\Bridgelabz\\src\\com\\bridgelabs\\inventorymanagement\\model\\InventoryManagement.json");
		file.write(json);
		file.flush();
		file.close();
	} catch (IOException e) {
		e.printStackTrace();
	}

}


	
	
}
