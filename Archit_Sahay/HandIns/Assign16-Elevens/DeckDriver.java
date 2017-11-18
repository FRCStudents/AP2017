class DeckDriver{
	public static void main (String [] argv){
		Deck a = new Deck();

		a.createDeck();
		a.displayDeck();
		System.out.println("Let The Game Begin");
		a.shuffleDeck();
		a.displayDeck();
		System.out.println("Deal It");


		a.dealCard();
	}
}	