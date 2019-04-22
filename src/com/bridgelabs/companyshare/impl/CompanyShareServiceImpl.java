package com.bridgelabs.companyshare.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabs.companyshare.data.CompanyShareService;
import com.bridgelabs.companyshare.model.CompanyShare;
import com.bridgelabs.functionalutil.CustomLinkedList;
import com.bridgelabs.functionalutil.FileOperation;
import com.google.gson.Gson;

public class CompanyShareServiceImpl implements CompanyShareService {
	JSONArray jsonArray;
	CompanyShare shares = new CompanyShare();

	List<CompanyShare> companyList = new ArrayList<>();
	CustomLinkedList<CompanyShare> linkedList = new CustomLinkedList<>();
	JSONObject jsonObject = new JSONObject();

	public CompanyShareServiceImpl() {
		fileRead();
	}

	private void fileRead() {
		JSONParser parser = new JSONParser();
		try {
			String path = "C:\\Users\\LENOVO\\eclipse-workspace\\Bridgelabz\\src\\com\\bridgelabs\\companyshare\\model\\Companyshare.json";
			jsonArray = (JSONArray) parser.parse(FileOperation.readFile(path));

			for (Object obj : jsonArray) {
				CompanyShare comShare = new CompanyShare();
				jsonObject = (JSONObject) obj;
				String name = (String) jsonObject.get("name");
				Long numberOfShares = (Long) jsonObject.get("share number");
				comShare.setComapanyName(name);
				comShare.setNoOfShare(numberOfShares);
				linkedList.add(comShare);

			}
		} catch (IOException | ParseException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void add(String companyName, Long numberOfShares) {

		CompanyShare share = new CompanyShare();

		share.setComapanyName(companyName);
		share.setNoOfShare(numberOfShares);
		linkedList.add(share);
		writeFile();
		System.out.println(linkedList.size());
	}

	@Override
	public void remove(String name) {

		System.out.println("Linked List" + new Gson().toJson(linkedList));

		for (CompanyShare share : linkedList) {
			if (share != null && share.getComapanyName().equals(name)) {
				linkedList.remove(share);
			}
		}
		System.out.println("removed");
		System.out.println("linked  list after removing:");
		linkedList.printList();
	}

	public void writeFile() {
		Gson gson = new Gson();
		System.out.println("list to be written into file");
		linkedList.printList();
		String json = gson.toJson(linkedList);
		System.out.println("writing into file");
		System.out.println("content" + json);

		try {
			FileWriter file = new FileWriter(
					"C:\\Users\\LENOVO\\eclipse-workspace\\Bridgelabz\\src\\com\\bridgelabs\\companyshare\\model\\Companyshare.json");
			file.write(json);
			file.flush();
			System.out.println("written into file");
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
