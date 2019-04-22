package com.bridgelabs.stockaccount.main;

import com.bridgelabs.functionalutil.DataStructureUtil;
import com.bridgelabs.functionalutil.FunctionalUtil;
import com.bridgelabs.stockaccount.data.StockAccountService;
import com.bridgelabs.stockaccount.impl.StockAccountServiceImpl;

public class StockAccountApp {

	public static void main(String[] args) {

		StockAccountService stockImpl = new StockAccountServiceImpl();
		{

            stockImpl.createStockAccount();
            while (true) {
    			System.out.println("1.Buy\n2.Sell\n3.calculate each share value\n4.Display\n5.Exit");
		    System.out.println("Input choice");
			int input = FunctionalUtil.inputInteger();
			switch (input) {
			
            case 1:
           
            	System.out.println("Choose a stock Company you want to buy:");
    			String StockCompany=DataStructureUtil.inputString();
    			System.out.println("Enter the amount you are buying for:");
    			double sharePrice= DataStructureUtil.inputDouble();
    			stockImpl.buy(StockCompany,sharePrice);
    			stockImpl.save();
    			break;
         
    		case 2:
    			System.out.println("Choose a stock Company you want to sell");
    			String SellCompany= DataStructureUtil.inputString();
    			System.out.println("Enter the amount you are selling for:");
    			double sharePrice1= DataStructureUtil.inputDouble();
    			stockImpl.sell(SellCompany,sharePrice1);
    			stockImpl.save();
    			break;
    	
       	  case 3:
                stockImpl.valueOf();
                break;
       	  case 4:
       		    stockImpl.printReport();
       		    break;
       	  case 5:
       		    System.exit(0);
       	  default:
       		  System.out.println("Please enter valid number");
			}

			
            }	
	
             
			}
	

	}

}
