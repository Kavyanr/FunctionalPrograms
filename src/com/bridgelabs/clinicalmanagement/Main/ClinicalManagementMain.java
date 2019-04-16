package com.bridgelabs.clinicalmanagement.Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ClinicalManagementMain {

	public static void main (String[] args) throws ParseException {
		
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader = new FileReader("C:\\Users\\LENOVO\\eclipse-workspace\\Bridgelabz\\src\\com\\bridgelabs\\clinicalmanagement\\model\\doctorJson.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONObject doctorList = (JSONObject) obj;
            //System.out.println(doctorList);
		 JSONArray array=(JSONArray) doctorList.get("Doctors");
		 Iterator<Object> iterator1= array.iterator();
          while(iterator1.hasNext())
          {
        	  System.out.println(iterator1.next());
          }
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
