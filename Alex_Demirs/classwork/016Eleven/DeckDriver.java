class DeckDriver{
	public static void main (String [] argv){
		Deck a = new Deck();

		a.createDeck();
		a.displayDeck();
		a.shuffleDeck();
		a.displayDeck();
		a.dealCard();
	}
}