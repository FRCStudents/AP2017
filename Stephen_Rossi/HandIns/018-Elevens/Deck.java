import java.util.Random;

public class Deck{
    final String[] values = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    final String[] suits = {"Spades","Diamonds","Hearts","Clubs"};

    public Card[] deck = new Card[suits.length * values.length];

    public Deck(){
        for(int s = 0; s < suits.length; s++){
            for(int v = 0; v < values.length; v++){
                deck[(s * values.length + v)] = new Card(values[v], suits[s]);
            }
        }
    }
    public Card getCard(int idx){
        return deck[idx];
    }
    public void shuffleDeck(){
        Random rand = new Random();
        for(int c = 0; c < deck.length; c++){
            int randIdx = rand.nextInt(deck.length);
            Card hold = deck[randIdx];
            deck[randIdx] = deck[c];
            deck[c] = hold;
        }
    }
    public int getLength(){
        return deck.length;
    }

}
