package com.bridgelabs.decksofcardsqueue.main;

import com.bridgelabs.deckofcardsqueue.impl.DeckOfCardsServiceImpl;

public class DeckOfCardsQueue {

	public static void main(String[] args) {
		DeckOfCardsServiceImpl deck=new DeckOfCardsServiceImpl();
		deck.initDeck();
		deck.shuffleDeck();
		deck.totalDeck();
		deck.printDeck();
	}

}
