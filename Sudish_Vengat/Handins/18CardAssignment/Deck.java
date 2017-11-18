import java.util.*;

public class Deck {
    
    //attributes
    final String[] suitArray = {"Clubs", "Diamonds", "Hearts", "Spades"};
    final String[] nameArray = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    final int[] rankArray = {2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -1, -1, 1};
    private Card[] deck = new Card[suitArray.length * rankArray.length];
  	private Card[] order = new Card[suitArray.length * rankArray.length]; 
    private int dealCard; 
    private int setRank;
    private Card[] Card = new Card[suitArray.length * rankArray.length];


    //getters and setters

    /* public int getDealCard(){
    	return dealCard;
    }

    public void setDealCard(int newDealCard){
    	dealCard = newDealCard;
    } */

	public int getSetRank(){
    	return setRank;
    }

    public void setSetRank(int newSetRank){
    	setRank = newSetRank;
    }

    public Card[] getOrder(){
    	return order;
    }

    public void setOrder(Card[] newOrder){
    	order = newOrder;
    }

    public Card[] getDeck(){
    	return deck;
    }

    public void setDeck(Card[] newDeck){
    	deck = newDeck;
    }

  
    //displays the deck
    public void displayDeck(Card[] deck) {
		for (int a = 0; a < deck.length; a++) {
			System.out.println(deck[a]);
		}
	}

	//creates the deck
	public void createDeck(){
    	for (int s = 0; s < suitArray.length; s++) {
            for (int b = 0; b < rankArray.length; b++) {
            	System.out.println("Created deck");
 	    	}
 		}
 	}

    //shuffles the deck
    public void shuffleDeck(Card[] deck, Card d) {
        int randomRank = deck.length;
        for(int i = 0; i < randomRank; i++){
        	Card shuffle = deck[randomRank];
            deck[randomRank] = deck[i];
            deck[i] = shuffle;
        }
    }

    //checks if deck d has the same order has the current deck
    public boolean sameOrder(){
    	return(getOrder() == order);
    }
	
	//deals the next card 
    public Card getDealCard() {
        if (dealCard > 32)  {
            return new Card();
        } else {
            dealCard++;
            return deck[dealCard - 1];
        }
    }
}