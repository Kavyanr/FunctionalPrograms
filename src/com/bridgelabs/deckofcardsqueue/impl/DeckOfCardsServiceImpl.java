package com.bridgelabs.deckofcardsqueue.impl;

import com.bridgelabs.deckofcardsqueue.data.DeckOfCardsService;
import com.bridgelabs.functionalutil.AlgorithmUtil;
import com.bridgelabs.functionalutil.QueueLinkedList;

public class DeckOfCardsServiceImpl implements DeckOfCardsService {

	String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	int n = suits.length * ranks.length;
	String[] deck = new String[n];
	QueueLinkedList<QueueLinkedList<String>> mainQueue = new QueueLinkedList<QueueLinkedList<String>>();
	QueueLinkedList<String> queueLinkedList = new QueueLinkedList<String>();

	@Override
	public void initDeck() {
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = ranks[i] + "" + suits[j];
			}
		}

	}

	@Override
	public void shuffleDeck() {

		for (int i = 0; i < n; i++) {
			double rand = (Math.random());

			int r = i + (int) (rand * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

	}

	@Override
	public void printDeck() {
		for (int i = 0; i < mainQueue.getSize(); i++) {
			QueueLinkedList<String> queue2 = mainQueue.remove();
			System.out.println("---------------------------------------- Person " + (i + 1)
					+ " -------------------------------------------");
			for (int j = 0; j < queue2.getSize(); j++) {
				System.out.print(queue2.remove() + " ");
			}
			System.out.println();
		}

	}

	@Override
	public void totalDeck() {

		System.out.println("Total number of deck of cards are " + deck.length);
		for (int i = 0; i < 4; i++) {
			String[] demo = new String[9];
			for (int j = 0; j < 9; j++) {
				demo[j] = deck[i + j * 4];
			}

			String[] str2 = AlgorithmUtil.BubbleSort(demo);
			for (int k = 0; k < str2.length; k++) {
				queueLinkedList.insert(str2[k]);
			}
			mainQueue.insert(queueLinkedList);
			queueLinkedList = new QueueLinkedList<String>();
			continue;
		}
	}

}
