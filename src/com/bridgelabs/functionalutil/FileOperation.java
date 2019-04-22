package com.bridgelabs.functionalutil;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.bridgelabs.inventory.model.Inventory;
import com.google.gson.Gson;

public class FileOperation {

	public static FileReader readFile(String path) {

		try {
			File file = new File(path);
			FileReader fileReader = new FileReader(file);
			return fileReader;
		} catch (IOException e) {
			e.printStackTrace();

		}
		return null;
	}

	public static FileWriter fileWriter(String path,String json)
	{
		try {
			FileWriter file=new FileWriter(path);
			file.write(json);
			file.flush();
			return file;
		}
		 catch (IOException e) {
				e.printStackTrace();
			}
		return null;
		
	}

}
