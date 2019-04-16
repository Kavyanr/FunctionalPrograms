package com.bridglabs.inventory.DataImpl;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabs.functionalutil.DataStructureUtil;
import com.bridgelabs.inventory.data.InventoryData;
import com.bridgelabs.inventory.model.Inventory;
import com.google.gson.Gson;

public class InventoryDataImpl implements InventoryData {

	JSONArray jsonArray;
	List<Inventory> inventories = new ArrayList<>();

	JSONObject jobject = new JSONObject();

	public void fileRead() {
		JSONParser parser = new JSONParser();
		{
			
				try {
					jsonArray = (JSONArray) parser.parse(new FileReader("C:\\Users\\LENOVO\\eclipse-workspace\\Bridgelabz\\src\\com\\bridgelabs\\inventory\\model\\JsonInventory.json"));
					System.out.println("====>>"+jsonArray);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				for (Object obj : jsonArray) {
					Inventory inventory = new Inventory();

					jobject = (JSONObject) obj;
					String name = (String) jobject.get("name");
					double price = ((Double) jobject.get("price")).doubleValue();
					double weight = ((Double) jobject.get("weight")).doubleValue();
					inventory.setWeight(weight);   //setWeight(weight);
					inventory.setName(name);
					// System.out.println(inventory.getName());

					// System.out.println(inventory.getWeight());
					inventory.setPrice(price);
					// System.out.println(inventory.getPrice());
					inventories.add(inventory);

					System.out.println(inventory.toString());
				
			} 
	}
	}

	@Override
	public double calculate(double price) {
		double totalPrice = 0;
		return totalPrice;
	}

	public void calculateInventory() {
		inventories.forEach(inventory -> System.out.println(
					"Total price of " + inventory.getName() + "is " +(inventory.getPrice()*inventory.getWeight())));
		
	}

	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(inventories);
		//System.out.println("divya" + json );
		//System.out.println("===>" + inventories );

		try(FileWriter file = new FileWriter("C:\\Users\\LENOVO\\eclipse-workspace\\Bridgelabz\\src\\com\\bridgelabs\\inventory\\model\\JsonInventory.json")){
			file.write(json);
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n JSON Object " + json);
	}



	@Override
	public void add(String name, double weight, double price) {
		Inventory inventory = new Inventory();
		inventory.setName(name);
		inventory.setPrice(price);
		inventory.setWeight(weight);
		inventories.add(inventory);
		inventories.forEach(inventory1 -> System.out.println(inventory1.toString()));
		
           
	}

	@Override
	public void remove(String name) {
		Inventory inventory = new Inventory();
		//fileRead();

		System.out.println("enter the name you wan to delete");

		String name1=DataStructureUtil.inputString();
		
		inventories.removeIf(inventory2->inventory2.getName().equals(name1));
		System.out.println(inventories);
		//System.out.println(inventories);
		System.out.println("removed successfully");
		writeFile();
		

	}
	}

	
	
	

