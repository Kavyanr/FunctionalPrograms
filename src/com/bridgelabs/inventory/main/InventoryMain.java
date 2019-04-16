package com.bridgelabs.inventory.main;


import java.io.IOException;
import org.json.simple.parser.ParseException;

import com.bridgelabs.functionalutil.DataStructureUtil;
import com.bridgelabs.functionalutil.OopsMethods;
import com.bridgelabs.inventory.data.InventoryData;
import com.bridglabs.inventory.DataImpl.InventoryDataImpl;

public class InventoryMain {
	public static void main(String[] args) throws IOException, ParseException
	{
		InventoryData inventaryImp = new InventoryDataImpl();
		
		{
		    inventaryImp.fileRead();
			System.out.println("enter name");
			String name=DataStructureUtil.inputString();
			//inv.setName(name);
			System.out.println("enter weight");
			int  weight=DataStructureUtil.inputinteger();
			
			System.out.println("enter price");
			double price=OopsMethods.inputDouble();
			
			
			inventaryImp.add(name, weight, price);
			inventaryImp.calculateInventory();
			inventaryImp.writeFile();
			inventaryImp.remove(name);
		}
}
}

