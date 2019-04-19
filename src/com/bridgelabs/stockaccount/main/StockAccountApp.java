package com.bridgelabs.stockaccount.main;

import com.bridgelabs.functionalutil.FunctionalUtil;
import com.bridgelabs.stockaccount.data.StockAccountService;
import com.bridgelabs.stockaccount.impl.StockAccountServiceImpl;

public class StockAccountApp {

	public static void main(String[] args) {

		StockAccountService stockImp = new StockAccountServiceImpl();
		{

            stockImp.createStockAccount();
		    System.out.println("Input choice");
			int input = FunctionalUtil.inputInteger();
			switch (input) {
			
            case 1:
            	System.out.println("Choose a stock Company you want to buy");
    			String StockCompany= FunctionalUtil.inputString();
    			System.out.println("Enter the amount you are buying for:");
    			double sharePrice= FunctionalUtil.inputDouble();
    			stockImp.buy(StockCompany,sharePrice);
    			stockImp.save();
    			break;
    		case 2:
                System.out.println("Choose a stock Company you want to sell");
    			String SellCompany= FunctionalUtil.inputString();
    			System.out.println("Enter the amount you are selling for:");
    			double sharePrice1= FunctionalUtil.inputDouble();
    			stockImp.sell(SellCompany,sharePrice1);
    			stockImp.save();
    			break;
       	  case 3:
                stockImp.valueOf();
                break;
       	  case 4:
       		    stockImp.printReport();
       		    break;
			}

			
			
	
             
			}
	

	}

}
