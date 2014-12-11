package it.unibo.scopone.interfaces;

public interface IDeck {
	public void shuffle(); //mischia il mazzo
	public ICard dealCard(); //prende una carta dal mazzo
	public int cardLeft(); //carte rimaste nel mazzo
}
