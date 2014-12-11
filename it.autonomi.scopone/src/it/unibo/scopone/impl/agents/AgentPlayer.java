package it.unibo.scopone.impl.agents;

import it.unibo.scopone.interfaces.IPlayerAgent;

public class AgentPlayer extends BasicPlayer {

	/*
	 * String name; IPlayerAgent nextAgent; List<ICard> cardsOnHand; ITable
	 * table; // Riferimento al tavolo di gioco List<ICard> deck; // mazzetto
	 */
	
	public AgentPlayer(String name) {
		super(name);
	}
	
	public AgentPlayer(String name, IPlayerAgent nextAgent)
	{
		super(name,nextAgent);
	}

	//Used by upper class
	@Override
	void deliberate()
	{
		
	}
}
