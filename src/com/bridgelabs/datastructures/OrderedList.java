package com.bridgelabs.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.bridgelabs.functionalutil.AlgorithmUtil;
import com.bridgelabs.functionalutil.SinglyLinkedList;

public class OrderedList {
	public static void main(String[] args) throws Exception {
		int n;
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		File file = new File("C:\\Users\\LENOVO\\list1.txt");
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];
		String delimitor = " ";
		String st;
		while ((st = bufferreader.readLine()) != null) {
			array = st.split(delimitor);
		}
		list.traverse();
		for (String k : array) {
			list.addElement(k);
		}
	    n=list.size();
       list.bubble(list, n);
       list.traverse();
}
}