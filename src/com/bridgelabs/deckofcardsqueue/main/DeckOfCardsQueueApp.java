package com.bridgelabs.deckofcardsqueue.main;

import com.bridgelabs.deckofcardsqueue.impl.DeckOfCardsServiceImpl;

public class DeckOfCardsQueueApp {

	public static void main(String[] args) {
		DeckOfCardsServiceImpl deck = new DeckOfCardsServiceImpl();
		deck.initDeck();
		deck.shuffleDeck();
		deck.totalDeck();
		deck.printDeck();
	}

}
