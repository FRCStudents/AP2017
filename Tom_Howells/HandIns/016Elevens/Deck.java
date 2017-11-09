import java.util.*;

class Deck {
    final String[] suitArr = {"Spades", "Diamonds", "Clubs", "Hearts"};
    final String[] valueArr = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    private Card[] deck = new Card[suitArr.length * valueArr.length];


    public Deck(Card[] a) {
        deck = a;
    }

    public Deck() {
        for (int i = 0; i < suitArr.length; i++) {
            for (int j = 0; j < valueArr.length; j++) {
                deck[(i * valueArr.length) + j] = new Card(valueArr[j], suitArr[i], true);
            }
        }
    }

    public Card getCard(int idx) {
        // idx starts at 0
        return deck[idx];
    }
    
    public void shuffle() {
        // implementation of fisher-yates shuffle algorithm
        Random rand = new Random();
        for(int i = 0; i < deck.length; i++) {
            // get random index past current index
            int randomVal = i + rand.nextInt(deck.length - i);
            // set shuffled array idx to randomly selected Card from deck
            Card swap = deck[randomVal];
            deck[randomVal] = deck[i];
            deck[i] = swap;
        }
    }

    public void reset() {
        for (int i = 0; i < suitArr.length; i++) {
            for (int j = 0; j < valueArr.length; j++) {
                deck[(i * valueArr.length) + j] = new Card(valueArr[j], suitArr[i], true);
            }
        }
    }
}