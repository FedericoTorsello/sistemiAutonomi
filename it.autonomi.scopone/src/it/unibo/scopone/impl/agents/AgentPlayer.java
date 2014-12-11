package it.unibo.scopone.impl.agents;

import java.util.List;

import it.unibo.scopone.interfaces.ICard;
import it.unibo.scopone.interfaces.IPlayerAgent;
import it.unibo.scopone.structs.Rules;
import it.unibo.scopone.structs.Seed;

public class AgentPlayer extends BasicPlayer {

	/*
	 * String name; IPlayerAgent nextAgent; List<ICard> cardsOnHand; ITable
	 * table; // Riferimento al tavolo di gioco List<ICard> deck; // mazzetto
	 */

	public AgentPlayer(String name) {
		super(name);
	}

	public AgentPlayer(String name, IPlayerAgent nextAgent) {
		super(name, nextAgent);
	}

	/**
	 * Sceglie una carta in maniera non deterministica a seguito di ragionamenti
	 * fatti in base a degli obbiettivi che gli permettono di guadagnare punti.
	 * Ragionamenti: Scopa Sette bello Denari Carte Primiera Una carta con un
	 * maggior coefficiente di fiducia ha maggiore possibilit� di essere
	 * giocata.
	 **/
	@Override
	void deliberate() {
		float[] trustArray = evaluateCardTrust();
	}

	/**
	 * Valuta la fiducia nella scelta di una determinata carta.
	 * 
	 * @return
	 */
	private float[] evaluateCardTrust() {
		float[] trustArray = new float[cardsOnHand.size()];
		for (int i = 0; i < trustArray.length; i++) {
			// per ogni carta ragiono
			float trust = 0.0f;

		}
		return trustArray;
	}

	// Ragionamenti

	private float setteBello(ICard card) {
		// La carta che esamino � il sette bello
		if (Rules.isSetteBello(card)) {
			if (Rules.existPresa(card, table.cardsOnTable()))
				;
			return 1.0f;
		}
		for (ICard tcard : table.cardsOnTable()) {
			// Il settebello � tra le carte in gioco (sul tavolo)
			if (Rules.isSetteBello(tcard)) {
				List<List<ICard>> prese = Rules.getPrese(card,
						table.cardsOnTable());
				for (List<ICard> presa : prese) {
					// Se almeno una presa contiene il sette bello allora ho pi�
					// fiducia
					for (ICard cp : presa) {
						if (Rules.isSetteBello(cp))
							return 1.0f;
					}
				}
			}
		}
		return 0.0f;
	}

	private float scopa(ICard card) {

		return 0.0f;
	}

	private float primiera(ICard card) {
		if (card.getNumber() == 7) {
			if (Rules.existPresa(card, table.cardsOnTable())) {
				return 0.5f;
			}
		}
		for (ICard tcard : table.cardsOnTable()) {
			// c'e' un 7 tra le carte in gioco sul tavolo
			if (card.getNumber() == 7) {
				List<List<ICard>> prese = Rules.getPrese(card,
						table.cardsOnTable());
				for (List<ICard> presa : prese) {
					// Se almeno una presa contiene il sette bello allora ho pi�
					// fiducia
					for (ICard cp : presa) {
						if (Rules.isSetteBello(cp))
							if (Rules.existPresa(card, table.cardsOnTable()))
								return 0.5f;
					}
				}
			}
		}
		return 0.0f;
	}

	private float carte(ICard card) {
		if (Rules.existPresa(card, table.cardsOnTable())) {
			return 0.4f;
		}
		for (ICard tcard : table.cardsOnTable()) {
			// c'e' un 7 tra le carte in gioco sul tavolo
			if (Rules.existPresa(card, table.cardsOnTable())) {
				List<List<ICard>> prese = Rules.getPrese(card,
						table.cardsOnTable());
				for (List<ICard> presa : prese) {
					// Se almeno una presa contiene il sette bello allora ho pi�
					// fiducia
					for (ICard cp : presa) {
						if (Rules.isSetteBello(cp))
							if (Rules.existPresa(card, table.cardsOnTable()))
								return 0.4f;
					}
				}
			}
		}
		return 0.0f;
	}

	private float denari(ICard card) {
		if (card.getSeed() == Seed.DENARI) {
			if (Rules.existPresa(card, table.cardsOnTable())) {
				return 1.0f;
			}
		}
		for (ICard tcard : table.cardsOnTable()) {
			// c'e' un denaro tra le carte in gioco sul tavolo
			if (Rules.existPresa(card, table.cardsOnTable())) {
				List<List<ICard>> prese = Rules.getPrese(card,
						table.cardsOnTable());
				for (List<ICard> presa : prese) {
					// se c'e' un denaro tra le carte in gioco sul tavolo
					// ho piu' fiducia
					for (ICard cp : presa) {
						if (Rules.isSetteBello(cp))
							if (Rules.existPresa(card, table.cardsOnTable()))
								return 0.4f;
					}
				}
			}
		}
		return 0.0f;
	}

	private void printTrustForCard(ICard card, float[] trustArray) {
		String pstr = "";
		for (int i = 0; i < trustArray.length; i++)
			log("");
	}
}
