package it.unibo.scopone.impl.agents;

import it.unibo.scopone.interfaces.ICard;
import it.unibo.scopone.interfaces.IPlayerAgent;

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
	 * Ragionamenti:
	 * 	Scopa
	 * 	Sette bello
	 * 	Denari
	 *	Carte
	 * 	Primiera
	 * Una carta con un maggior coefficiente di fiducia ha maggiore possibilità di essere
	 * giocata.
	 **/
	@Override
	void deliberate() {
		float[] trustArray = evaluateCardTrust();
	}

	/**
	 * Valuta la fiducia nella scelta di una determinata carta.
	 * @return
	 */
	private float[] evaluateCardTrust() {
		float[] trustArray = new float[cardsOnHand.size()];
		for(int i = 0; i < trustArray.length; i++){
			//per ogni carta ragiono
			float trust = 0.0f;
			
		}
		return trustArray;
	}
	
	private float setteBello(ICard card){
		
		return 0.0f;
	}
	
	private float scopa(ICard card){
		
		return 0.0f;
	}
	
	private float primiera(ICard card){
		
		return 0.0f;
	}
	
	private float carte(ICard card){
		
		return 0.0f;
	}

	private float denari(ICard card){
		
		return 0.0f;
	}
}
