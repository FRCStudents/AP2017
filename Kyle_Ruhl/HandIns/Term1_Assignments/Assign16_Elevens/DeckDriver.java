public class DeckDriver{
	public static void main(String[] args) {
		Deck d = new Deck();
		Deck s = new Deck();
		
		System.out.println("\nShowing the Deck, unshuffled: \n");
		d.displayDeck();
		d.dealCard();
	
		System.out.println("\nShuffled Deck:\n");
		
		s.shuffle(15);
		s.displayDeck();
		
		System.out.println("Completed");
 }
}