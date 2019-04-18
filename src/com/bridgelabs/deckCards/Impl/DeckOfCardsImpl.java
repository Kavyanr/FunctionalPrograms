package com.bridgelabs.deckCards.Impl;

import com.bridgelabs.deckCards.Interface.DeckOfCardsInterface;

public class DeckOfCardsImpl implements DeckOfCardsInterface{

	String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	int n = suits.length * ranks.length;
	String[] deck = new String[n];

	// Initialize the deck
	@Override
	public void initDeck() {

		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = ranks[i] + "" + suits[j];
			}
		}
	}

	// Shuffle the deck of Cards
	@Override
	public void shuffleDeck() {
		for (int i = 0; i < n; i++) {
			double rand = (Math.random());
			// System.out.println(rand);

			int r = i + (int) (rand * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

	}

	// print shuffled deck
	@Override
	public void printDeck()
		{
		    for (int i = 0; i < n; i++) {
			System.out.println(deck[i]);
		}
		}

	public void totalDeck()
	{
		
		for (int i = 0; i < 4; i++) {
			System.out.print(" Person " + i  + " \t");
		}
			System.out.print("\n");
			for( int i=0;i<9;i++)
			{
			for (int j = 0; j < 4; j++) {
				System.out.print(" " + (deck[i + j * 4]) + " \t");
			}
			System.out.println();
		}
		
	}

	}
