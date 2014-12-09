package it.unibo.scopone.interfaces;

import java.util.List;

public interface ITable{
	public List<ICard> cardsOnTable(); 
	/**
	 * Esegue la mossa specificata dall'agente, 
	 * usando la carta card e prendendo dal tavolo 
	 * le carte specificate nella lista taking.  
	 * @param card = carta usata nella mossa
	 * @param presa = carte che si desidera raccogliere dal tavolo
	 * @return false se l'azione non è permessa dal regolamento
	 */
	public boolean action(ICard card, List<ICard> taking);
	public void printTableCards();
}