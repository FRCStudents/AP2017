public class Deck{
	final int[] Number = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	final String[] Suit = {"Spades","Hearts","Clubs","Diamonds"};
	
	public Card[] deck = new Card[Suit.length * Number.length];

	 public Deck(boolean shuffled) {
        for (int i = 0; i < suitArr.length; i++) {
            for (int j = 0; j < valueArr.length; j++) {
                deck[(i * valueArr.length) + j] = new Card(suitArr[i], nameArr[j], valueArr[j], false);
            }
        }
        nextCard = 0;

        if (shuffled) {
            shuffle();
            shuffle();
            shuffle();
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for(int i = 0; i < deck.length; i++) {
            int randomVal = i + rand.nextInt(deck.length - i);
            Card swap = deck[randomVal];
            deck[randomVal] = deck[i];
            deck[i] = swap;
        }
    }
    public Card getNextCard() {
        if (nextCard > 51) {
            return new Card("Blank", "Blank", 0, true);
        } else {
            nextCard++;
            return deck[nextCard - 1];
        }
    }