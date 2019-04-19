package com.bridgelabs.address.data;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public interface AddressBookService {
    public void addPerson(String firstName, String lastName, Long zipCode, Long phoneNumber, String city, String state, String address);
    public void removePerson();
    public void sortByLastName();
    public void sortByZipCode();
    public void writeFile();
    public void fileRead() throws FileNotFoundException, IOException, ParseException;
}