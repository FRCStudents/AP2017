import java.util.*;

class Deck {
    // attributes
    final String[] suitArr = {"Spades", "Diamonds", "Clubs", "Hearts"};
    final String[] nameArr = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    final int[] valueArr = {2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -1, -1, 1};
    private Card[] deck = new Card[suitArr.length * valueArr.length];
    public int nextCard; // used to track nextCard to be pulled from the deck, zero relative

    // constructor
    public Deck(boolean shuffled) {
        for (int i = 0; i < suitArr.length; i++) {
            for (int j = 0; j < valueArr.length; j++) {
                deck[(i * valueArr.length) + j] = new Card(suitArr[i], nameArr[j], valueArr[j], false);
            }
        }
        nextCard = 0;

        if (shuffled) {
            // found that only one or two shuffles doesn't make it random enough
            shuffle();
            shuffle();
            shuffle();
        }
    }

    // shuffle the deck
    public void shuffle() {
        // implementation of fisher-yates shuffle algorithm
        Random rand = new Random();
        for(int i = 0; i < deck.length; i++) {
            // get random index past current index
            int randomVal = i + rand.nextInt(deck.length - i);
            // swaps randomly selected card with card at index i
            Card swap = deck[randomVal];
            deck[randomVal] = deck[i];
            deck[i] = swap;
        }
    }

    // getNextCard
    public Card getNextCard() {
        if (nextCard > 51) {
            return new Card("Blank", "Blank", 0, true);
        } else {
            nextCard++;
            return deck[nextCard - 1];
        }
    }
}