import java.util.*;

class Deck {
    
    final String[] suitArr = {"Spades", "Diamonds", "Clubs", "Hearts"};
    final int[] numArr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    final int[] rankArr = {2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -1, -1, 1};
    private Card[] deck = new Card[suitArr.length * rankArr.length];
    public int nextCard; 
   
    public Deck(boolean shuffled) {
        for (int i = 0; i < suitArr.length; i++) {
            for (int j = 0; j < rankArr.length; j++) {
                deck[(i * rankArr.length) + j] = new Card(suitArr[i], numArr[j], rankArr[j]);
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
            return new Card("Something", 2, 0);
        } else {
            nextCard++;
            return deck[nextCard - 1];
        }
    }
    	    
    public int spaces;
    private Card[] theArray;

    

    
    public void replace(int idx, Card newCard) {
        theArray[idx - 1] = newCard;
    }

   
    public void display() {
        for (int i = 1; i <= theArray.length; i++) {
            System.out.println(i + ": " + theArray[i - 1]);
        }
    }

    
    public Card getCard(int idx) {
        return theArray[idx - 1];
    }

    
}