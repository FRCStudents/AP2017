import java.util.Random;
import java.util.*;


public class Deck {
	private Card[] deck;
	private ArrayList<Card> deckk = new ArrayList <Card>();
	private Random rand = new Random();

	public Deck(){
		deck = new Card[52];
	}

	public Card[] getDeck(){
		return deck;
	}
	
	public void createDeck(){
		for (int i = 0; i < deck.length; i ++){
			deck [i] = new Card();
			if (i <= 12){
				deck[i].setSuit("Spades");
				deck[i].setNumber(i + 1);
			}
			if (12 < i && i <= 25){
				deck[i].setSuit("Clubs");
				deck[i].setNumber(i - 12);
			}
			if (25 < i && i <= 38){
				deck[i].setSuit("Diamonds");
				deck[i].setNumber(i - 25);  
			}
			if (38 < i && i <= 52){
				deck[i].setSuit("Hearts");
				deck[i].setNumber(i - 37);
			}
		}
	}

	public void displayDeck(){
		for (int i = 0; i < deck.length; i ++){
			System.out.print("Card " + (i+1) + ":\n" );
			deck[i].printCard();
		} 
	}

	public void shuffleDeck(){
		 for(int i = 0; i < deck.length; i++) {
            int randomVal = i + rand.nextInt(deck.length - i);
         
           Card swap = deck[randomVal];
            deck[randomVal] = deck[i];
            deck[i] = swap;
		}
	}

	public boolean sameOrder(Deck d){
		for (int i = 0; i < deck.length; i ++){
			if (deck[i] == d.deck[i]){
				return true;
			}
			return false;
		}
		return false;
	}

	public void dealCard(){
		deck[0].printCard();
	}
 }