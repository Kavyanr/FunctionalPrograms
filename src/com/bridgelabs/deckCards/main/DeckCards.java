package com.bridgelabs.deckCards.main;

import com.bridgelabs.deckCards.Impl.DeckOfCardsImpl;

public class DeckCards {

	public static void main(String[] args) {
		DeckOfCardsImpl deck = new DeckOfCardsImpl();
		//Initialize the deck of cards
		deck.initDeck();
		//Shuffle the deck of cards
		deck.shuffleDeck();
		//Print the shuffled deck of cards
		//deck.printDeck();
		//Print the deck of 9 cards distributed to 4 people
	    deck.totalDeck();
	}

}
