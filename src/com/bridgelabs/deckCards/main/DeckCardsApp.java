package com.bridgelabs.deckCards.main;

import com.bridgelabs.deckCards.Impl.DeckOfCardsServiceImpl;
import com.bridgelabs.deckCards.Interface.DeckOfCardsService;

public class DeckCardsApp {

	public static void main(String[] args) {
		DeckOfCardsService deck = new DeckOfCardsServiceImpl();

		deck.initDeck();

		deck.shuffleDeck();

		deck.totalDeck();
	}

}
