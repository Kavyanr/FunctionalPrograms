package com.bridgelabs.datastructures;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabs.functionalutil.AlgorithmUtil;
import com.bridgelabs.functionalutil.QueueLinkedList;

public class PrimeOnQueue {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		QueueLinkedList<Integer> queue = new QueueLinkedList<Integer>();

		list = AlgorithmUtil.isPrime(0, 1000);

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (AlgorithmUtil.Anagram(String.valueOf(list.get(i)), String.valueOf(list.get(j)))) {
					queue.insert(list.get(i));
					queue.insert(list.get(j));
				}
			}
		}
		System.out.println("Elements in a queue are :");
		queue.display();
	}
}