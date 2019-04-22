package com.bridgelabs.stock.implementation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabs.functionalutil.FileOperation;
import com.bridgelabs.stock.data.StockInterface;
import com.bridgelabs.stock.model.Stock;
import com.google.gson.Gson;

public class StockImplementation implements StockInterface {
	public StockImplementation() {
		readFile();
	}

	JSONArray jsonArray;
	List<Stock> listOfStocks = new ArrayList<>();

	JSONObject jsonObject = new JSONObject();

	private void readFile() {
		JSONParser parser = new JSONParser();
		String path = "C:\\Users\\LENOVO\\eclipse-workspace\\Bridgelabz\\src\\com\\bridgelabs\\stock\\model\\Stock.json";
		try {
			jsonArray = (JSONArray) parser.parse(FileOperation.readFile(path));
			for (Object obj : jsonArray) {
				Stock stockObject = new Stock();

				jsonObject = (JSONObject) obj;
				String shareName = (String) jsonObject.get("shareName");
				double numberOfShares = ((Double) jsonObject.get("numberOfShare")).doubleValue();
				double sharePrice = ((Double) jsonObject.get("sharePrice")).doubleValue();
				stockObject.setShareName(shareName);
				stockObject.setNumberOfShare(numberOfShares);
				stockObject.setSharePrice(sharePrice);

				listOfStocks.add(stockObject);
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addStock(String stockName, double noOfShare, double sharePrice) {
		Stock stockObject = new Stock();
		stockObject.setShareName(stockName);
		stockObject.setNumberOfShare(noOfShare);
		stockObject.setSharePrice(sharePrice);
		listOfStocks.add(stockObject);
		writeFile();
	}

	@Override
	public void calculateStock() {
		listOfStocks.forEach(stock -> System.out.println("Total price of " + stock.getShareName() + " is "
				+ (stock.getNumberOfShare() * stock.getSharePrice())));
	}

	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(listOfStocks);
		try (FileWriter file = new FileWriter(
				"C:\\Users\\LENOVO\\eclipse-workspace\\Bridgelabz\\src\\com\\bridgelabs\\stock\\model\\Stock.json")) {
			file.write(json);
			file.flush();
			System.out.println("SuccessFully copied to JSON  Object to File......");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void calculateTotalStock() {
		double sum = 0;
		for (Stock stock : listOfStocks) {
			sum = sum + (stock.getSharePrice() * stock.getNumberOfShare());
		}
		System.out.println("Total profit of shareholder=" + sum);
	}
}
