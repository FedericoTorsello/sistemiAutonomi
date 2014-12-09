package it.unibo.scopone.impl.agents;

import java.util.ArrayList;
import java.util.List;

import it.unibo.scopone.impl.Table;
import it.unibo.scopone.interfaces.ICard;
import it.unibo.scopone.interfaces.IPlayerAgent;
import it.unibo.scopone.interfaces.ITable;
import it.unibo.scopone.structs.Action;

public class BasicPlayer implements IPlayerAgent{
	
	String name;
	IPlayerAgent nextAgent;
	List<ICard> cardsOnHand;
	ITable table; //Riferimento al tavolo di gioco
	List<ICard> deck; //mazzetto
	Action intendedAction = null;
	
	public BasicPlayer(String name, IPlayerAgent nextAgent) {
		this.name = name;
		this.nextAgent = nextAgent;
		init();
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	private void init(){
		deck = new ArrayList<ICard>();
		table = Table.getInstance();
	}

	@Override
	public void setCardsOnHand(List<ICard> cards) {
		this.cardsOnHand = cards;
	}
	
	@Override
	public void deliberate() {
		//Processo deliberativo
	}
	
	@Override
	public void playCard(ICard card, List<ICard> taking) {
		if(table.action(card, taking)){
			log("Giocata la carta " + card.getCardStr());
		}else{
			log("Impossibile giocare la carta");
		}
	}
	
	@Override
	public void endTurn() {
		nextAgent.notifyYourTurn();
	}
	
	@Override
	public void notifyYourTurn() {
		//Starts thinking and do stuff
		log("E' il mio turno!");
	}
	
	private void log(String text){
		System.out.println(name+"] " + text);
	}
	
}
