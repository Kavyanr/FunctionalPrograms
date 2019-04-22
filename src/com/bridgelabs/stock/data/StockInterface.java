package com.bridgelabs.stock.data;

public interface StockInterface {

	public void addStock(String stockName, double noOfShare, double sharePrice);

	public void calculateStock();

	public void calculateTotalStock();
}