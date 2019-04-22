package com.bridgelabs.inventory.DataImpl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabs.functionalutil.FileOperation;
import com.bridgelabs.inventory.data.InventoryManager;
import com.bridgelabs.inventory.model.Inventory;
import com.google.gson.Gson;

public class InventoryDataImpl implements InventoryManager {

	public InventoryDataImpl() {
		fileRead();
	}

	JSONArray jsonArray;
	List<Inventory> inventories = new ArrayList<>();

	JSONObject jsonObject = new JSONObject();

	private void fileRead() {
		JSONParser parser = new JSONParser();
		try {
			String path = "C:\\Users\\LENOVO\\eclipse-workspace\\Bridgelabz\\src\\com\\bridgelabs\\inventory\\model\\JsonInventory.json";
			jsonArray = (JSONArray) parser.parse(FileOperation.readFile(path));

			for (Object obj : jsonArray) {
				Inventory inventory = new Inventory();

				jsonObject = (JSONObject) obj;
				String name = (String) jsonObject.get("name");
				double price = ((Double) jsonObject.get("price")).doubleValue();
				double weight = ((Double) jsonObject.get("weight")).doubleValue();

				inventory.setWeight(weight);
				inventory.setName(name);
				inventory.setPrice(price);
				inventories.add(inventory);

				System.out.println(inventory.toString());
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	@Override
	public double calculate(double price) {
		double totalPrice = 0;
		return totalPrice;
	}

	public void calculateInventory() {
		inventories.forEach(inventory -> System.out.println(
				"Total price of " + inventory.getName() + "is " + (inventory.getPrice() * inventory.getWeight())));
	}

	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(inventories);
		try (FileWriter file = new FileWriter(
				"C:\\Users\\LENOVO\\eclipse-workspace\\Bridgelabz\\src\\com\\bridgelabs\\inventory\\model\\JsonInventory.json")) {
			file.write(json);
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void add(String name, double weight, double price) {
		Inventory inventory = new Inventory();
		inventory.setName(name);
		inventory.setPrice(price);
		inventory.setWeight(weight);
		inventories.add(inventory);
		inventories.forEach(inventory1 -> inventory1.toString());
		writeFile();
	}

	@Override
	public void remove(String name) {
		inventories.removeIf(inventory2 -> inventory2.getName().equals(name));
		System.out.println(inventories);
		System.out.println("removed successfully");
		writeFile();
	}
}