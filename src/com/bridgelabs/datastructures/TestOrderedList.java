package com.bridgelabs.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabs.functionalutil.DataStructureUtil;
import com.bridgelabs.functionalutil.SinglyLinkedList;

public class TestOrderedList {

	public static void main(String[] args) throws IOException {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		File file = new File("C:\\Users\\LENOVO\\list1.txt");
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];

		String st;
		while ((st = bufferreader.readLine()) != null) {
			array = st.split(" ");
		}
		bubbleSort(array);
		for (String k : array) {
			list.addElement(k);

		}

		// list.traverse();
		list.get();

		System.out.println("Enter the key value: ");
		String key = DataStructureUtil.inputString();

		SinglyLinkedList<String> newList = list.searchKey(list, key);

		FileWriter fw = null;

		fw = new FileWriter("C:\\Users\\LENOVO\\list1.txt");

		String data = newList.toString();

		fw.write(data);
		// fw.write("Test ");
		fw.close();

		System.out.println("ordered List -" + data);
	}

	static String[] bubbleSort(String[] array) {
		for (int j = 0; j < array.length; j++) {
			for (int i = j + 1; i < array.length; i++) {
				// comparing strings
				if (array[i].compareTo(array[j]) < 0) {

					String temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
		return array;
	}
}
