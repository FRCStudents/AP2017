public class DeckDriver{
	public static void main(String[] argv){

		Deck a = new Deck();

		System.out.println("\nCreating Deck!");
		a.createDeck();

		System.out.println("\nShuffling Deck!");
		a.shuffleDeck();

		System.out.println("\nDisplaying Deck!");
		a.displayDeck();
		
		System.out.println("\nHere's Your Card!");
		a.dealCard();

	}
}