class DeckDriver{
	public static void main (String [] argv){
		Deck a = new Deck();

		a.createDeck();
		a.displayDeck();
		System.out.println("Shuffle em up, baby!");
		a.shuffleDeck();
		a.displayDeck();
		System.out.println("Deal that sucker!");


		a.dealCard();
	}
}