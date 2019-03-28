package com.bridgelabs.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


import com.bridgelabs.functionalutil.DataStructureUtil;
import com.bridgelabs.functionalutil.SinglyLinkedList;

public class UnorderedList {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		File file = new File("C:\\Users\\LENOVO\\list.txt");
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];
		String delimitor = " ";
		String st;
		while ((st = bufferreader.readLine()) != null) {
			array = st.split(delimitor);
		}
		for (String k : array) {
			list.addElement(k);
		}
       
		System.out.println("Enter the key value: ");
		String key = DataStructureUtil.inputString();
		boolean result=list.searchKey(key);
		if(result==true)
			list.addElement(key);
		else
			list.remove(key);
		 
		  
		 }
}