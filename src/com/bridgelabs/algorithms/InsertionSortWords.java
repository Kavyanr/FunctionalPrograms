package com.bridgelabs.algorithms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabs.functionalutil.AlgorithmUtil;

public class InsertionSortWords {

	public static void main(String[] args) {
		System.out.println("Enter size: ");
		int n =AlgorithmUtil.inputinteger();
		List<String> words = new ArrayList<>();
		System.out.println("Enter the words:");

		for(int i=0;i<=n;i++){
			words.add(AlgorithmUtil.inputString());
		}
		AlgorithmUtil.insertString(words,n);
		
	}

}
