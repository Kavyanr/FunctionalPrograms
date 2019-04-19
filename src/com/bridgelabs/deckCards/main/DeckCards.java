package com.bridgelabs.deckCards.main;

import com.bridgelabs.deckCards.Impl.DeckOfCardsImpl;
import com.bridgelabs.deckCards.Interface.DeckOfCardsInterface;

public class DeckCards {

	public static void main(String[] args) {
		DeckOfCardsInterface deck = new DeckOfCardsImpl();
		
		deck.initDeck();
	
		deck.shuffleDeck();
		
	    deck.totalDeck();
	}

}
