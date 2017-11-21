/*

IMPORTANT NOTES:

Number 11 = Jacks
Number 12 = Queens
Number 13 = Kings
Number 1 = Aces

*/

import java.util.Random;

public class Deck{
	
	private Card[] deck;
	private int z = 0;
	private Random randomNum = new Random();
		
		public Deck(){
			deck = new Card[52];
		}

		public Card[] getDeck(){
			return deck;
		}

//Creates The Deck
		public void createDeck(){
		for (int i = 0; i < deck.length; i ++){
			deck[i] = new Card();
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
				deck[i].setNumber(i - 38);
			}
		}
	}


//Shuffles The Deck
		public void shuffleDeck(){
			for (int i = 0; i < deck.length; i++) {
        		int randomVal = i + randomNum.nextInt(deck.length - i);
         
        		Card swap = deck[randomVal];
        		deck[randomVal] = deck[i];
        		deck[i] = swap;
			}
		}

// dealCard() Deals The Top Card
// The Top Card Will Always Be Different Because Once You Take Off The Card On Top,
// The Next Time You Call dealDard(), The New Top Card Will Be Presented	
		public void dealCard(){
			deck[z].printCard();
			z++;
		}

//Determines If Two Decks Are In The Same Order
		public boolean sameOrder(Deck e){
			for (int i = 0; i < deck.length; i ++){
				if (deck[i] == e.deck[i]){
					return true;
				}
				return false;
			}
			return false;
		}


//Displays The Entire Deck
		public void displayDeck(){
			for (int i = 0; i < deck.length; i ++){
				deck[i].printCard();
			} 
		}

}