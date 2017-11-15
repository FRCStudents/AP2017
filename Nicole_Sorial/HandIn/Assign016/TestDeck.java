class TestDeck { // Tests both Card and Deck objects
	public static void main(String[] argv) {

		Deck d = new Deck();

		System.out.println("Number of cards in the deck: " + d.returnDeck().length);

		System.out.println("Cards in the deck in order:");
		d.displayDeck(d.getDeck());

		System.out.println("\nCards in shuffled deck:");
		d.displayDeck(d.getShuffledDeck());

		System.out.println("\nTesting ranking:  ---> should print out true, true, false, false, false, true");
		Card a = new Card("10", "Hearts", true);
		Card b = new Card("Aces", "Hearts", true);
		Card c = new Card("10", "Clubs", true);
		Card dd = new Card("10", "Hearts", true);
		Card e = new Card("Jack", "Clubs", true);
		Card f = new Card("10", "Spades", true);

		System.out.println(d.isHigher(a, b));
		System.out.println(d.isHigher(a, c));
		System.out.println(d.isHigher(a, dd));
		System.out.println(d.isHigher(a, e));
		System.out.println(d.isHigher(a, f));
		System.out.println(c.isEqual(a, dd));

		System.out.println("\nTesting if decks are in same order:  ---> should print out false, true, true");
		System.out.println(d.sameOrder(d.getDeck(), d.getShuffledDeck()));
		System.out.println(d.sameOrder(d.getDeck(), d.getDeck()));
		System.out.println(d.sameOrder(d.getShuffledDeck(), d.getShuffledDeck()));

		System.out.println("\nTesting dealCard():   ---> should print out 3 cards in random order");
		d.dealCard();
		d.dealCard();
		d.dealCard();
	}
}