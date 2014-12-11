package it.autonomi.scopone.main;

import java.util.ArrayList;
import java.util.Random;

import it.unibo.scopone.impl.*;
import it.unibo.scopone.structs.Seed;

public class Main {
	static final int NUMCARDMAX = 40;
	static final int numSeed = 4;
	protected static Card card;
	static Random random = new Random();
	static ArrayList<Card> initialDeck;
	static ArrayList<Card> finalDeck;

	public static void main(String[] args) {
		initialDeck = new ArrayList<Card>();
		finalDeck = new ArrayList<Card>();
		generationDeck(Seed.BASTONI);
		generationDeck(Seed.COPPE);
		generationDeck(Seed.DENARI);
		generationDeck(Seed.SPADE);
		randomCard();
	}

	public static void generationDeck(Seed inputSeed) {
		for (int i = 1; i <= NUMCARDMAX/numSeed; i++) {
			card = new Card(i, inputSeed);
			initialDeck.add(card);
		}
	}

	// serve a mischiare le carte
	public static void randomCard() {
		for (int i = 0; i < NUMCARDMAX; i++) {
			int r = (int) (Math.random() * i);
			finalDeck.add(r, initialDeck.get(i));
		}
		for (int i = 0; i < NUMCARDMAX; i++) {
			System.out.println(finalDeck.get(i).getCardStr());
		}
	}

}
