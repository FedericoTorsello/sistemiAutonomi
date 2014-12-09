package it.unibo.scopone.impl;

import java.util.List;

import it.unibo.scopone.interfaces.ICard;
import it.unibo.scopone.interfaces.ITable;
import it.unibo.scopone.structs.Rules;

public class Table implements ITable {

	List<ICard> cardsOnTable;
	
	@Override
	public List<ICard> cardsOnTable() {
		return cardsOnTable;
	}

	@Override
	public boolean action(ICard card, List<ICard> presa) {
		if(Rules.azionePossibile(card, cardsOnTable, presa)){
			cardsOnTable.add(card);
			if(presa.size() != 0){
				//Presa effettuata, raccolgono carte dal tavolo
				cardsOnTable.removeAll(presa);
			}
			return true;
		}
		else
			return false;
	}
	
	@Override
	public void printTableCards() {
		System.out.println("\n---TABLE CARDS\n");
		for(ICard c : cardsOnTable)
			System.out.println(c.getCardStr() + "\n");
		System.out.println("\n\n");
	}
}
