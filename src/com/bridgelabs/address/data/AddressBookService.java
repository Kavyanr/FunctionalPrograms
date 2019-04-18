package com.bridgelabs.address.data;
public interface AddressBookService {
    public void addPerson(String firstname, String lastname, Long zipcode, Long phonenumber, String city, String state, String address);
    public void removePerson();
    public void sortByLastName();
    public void sortByZipCode();
}