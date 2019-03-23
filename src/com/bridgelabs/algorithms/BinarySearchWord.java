package com.bridgelabs.algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.bridgelabs.functionalutil.Algorithm_Util;

public class BinarySearchWord {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		File file =new File("C:\\Users\\LENOVO\\Words.txt");
		BufferedReader bufferreader=new BufferedReader(new FileReader(file));
		String[] string =new String[50];
		String delimitor=" ";
		String st;
		while((st=bufferreader.readLine())!=null)
		{
			string=st.split(delimitor);
		}
		System.out.print("Array elements are: ");
	    for(String array:string)
	    {
	    	if(array!=null)
	    		System.out.print(array + "  ");
	    }
	    System.out.println("  ");
	    System.out.print("Sorted array:");
	    Algorithm_Util.BubbleSort(string);
	    System.out.println("Enter the key element:");
	    String key=Algorithm_Util.inputString();
	    Algorithm_Util.BinarySearch(string, key);

	}

}
