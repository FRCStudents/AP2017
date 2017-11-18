import java.util.*;

class Deck {
    final String[] SuitArr = {"Spades", "Diamonds", "Clubs", "Hearts"};
    final String[] nameArr = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    final int[] NumberArr = {2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -1, -1, 1};
    private Card[] Deck = new Card[SuitArr.length * NumberArr.length];
    public int nextCard; 

    public Deck(boolean shuffled) {
        for (int i = 0; i < SuitArr.length; i++) {
            for (int j = 0; j < NumberArr.length; j++) {
                Deck[(i * NumberArr.length) + j] = new Card(SuitArr[i], nameArr[j], NumberArr[j], false);
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
        for(int i = 0; i < Deck.length; i++) {
            int randomVal = i + rand.nextInt(Deck.length - i);
            Card swap = Deck[randomVal];
            Deck[randomVal] = Deck[i];
            Deck[i] = swap;
        }
    }

    public Card getNextCard() {
        if (nextCard > 51) {
            return new Card("Blank", "Blank", 0, true);
        } else {
            nextCard++;
            return Deck[nextCard - 1];
        }
    }
}