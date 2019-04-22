package com.bridgelabs.address.implementation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabs.address.data.AddressBookService;
import com.bridgelabs.address.model.Address;
import com.bridgelabs.functionalutil.DataStructureUtil;
import com.bridgelabs.functionalutil.FileOperation;
import com.google.gson.Gson;

public class AddressBookServiceImplementation implements AddressBookService {
	public AddressBookServiceImplementation() {
		fileRead();
	}

	JSONArray jsonArray;
	List<Address> addressList = new ArrayList<>();
	JSONObject jsonObject = new JSONObject();

	private void fileRead() {
		JSONParser parser = new JSONParser();
		String path = "C:\\Users\\LENOVO\\eclipse-workspace\\Bridgelabz\\src\\com\\bridgelabs\\address\\model\\address.json";
		try {
			jsonArray = (JSONArray) parser.parse(FileOperation.readFile(path));
			for (Object obj : jsonArray) {
				Address addressDetail = new Address();
				jsonObject = (JSONObject) obj;
				
				String firstName = (String) jsonObject.get("firstName");
				String lastName = (String) jsonObject.get("lastName");
				String city = (String) jsonObject.get("city");
				String address = (String) jsonObject.get("address");
				String state = (String) jsonObject.get("state");
				Long phoneNumber = (Long) jsonObject.get("phoneNumber");
				Long zipCode = (Long) jsonObject.get("zipCode");

				addressDetail.setFirstName(firstName);
				addressDetail.setLastName(lastName);
				addressDetail.setCity(city);
				addressDetail.setAddress(address);
				addressDetail.setState(state);
				addressDetail.setPhoneNumber(phoneNumber);
				addressDetail.setZipCode(zipCode);

				addressList.add(addressDetail);
			}
			System.out.println(addressList.toString());
		} catch (ParseException | IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addPerson(String firstName, String lastName, Long zipCode, Long phoneNumber, String city, String state,
			String address) {
		Address address1 = new Address();
		address1.setFirstName(firstName);
		address1.setLastName(lastName);
		address1.setPhoneNumber(phoneNumber);
		address1.setCity(city);
		address1.setAddress(address);
		address1.setState(state);
		address1.setZipCode(zipCode);
		addressList.add(address1);
		addressList.forEach(details -> System.out.println(details.toString()));
		writeFile();
	}

	@Override
	public void removePerson() {
		System.out.println("Enter name to be removed :");
		String removeName = DataStructureUtil.inputString();
		addressList.removeIf(delete -> delete.getFirstName().equalsIgnoreCase(removeName));
		writeFile();
		System.out.println("Successfully removed elements from the list");
	}

	@Override
	public void sortByLastName() {
		addressList.sort((Address s1, Address s2) -> s1.getLastName().compareTo(s2.getLastName()));
		addressList.forEach(result -> System.out.println(result));
	}

	@Override
	public void sortByZipCode() {
		addressList.sort((Address s1, Address s2) -> s1.getZipCode().compareTo(s2.getZipCode()));
		addressList.forEach(details -> System.out.println(details));
	}

	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(addressList);
		try (FileWriter file = new FileWriter(
				"C:\\Users\\LENOVO\\eclipse-workspace\\Bridgelabz\\src\\com\\bridgelabs\\address\\model\\address.json")) {
			file.write(json);
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
