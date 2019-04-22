package com.bridgelabs.address.data;

public interface AddressBookService {
	public void addPerson(String firstName, String lastName, Long zipCode, Long phoneNumber, String city, String state,
			String address);

	public void removePerson();

	public void sortByLastName();

	public void sortByZipCode();

}