import java.util.Random;
import java.util.*;

public class ElevensBase {
	private static String[] cardOptions = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private static int suits;
	private static String[] newDeck = new String[52];
	private static String[] lastDeck = new String[52];
	private static String[] usedCards = new String[0];
	private static String suit;

	
	public ElevensBase() {
		suits = 4;
	}

	public String[] getCardOptions(){
		return cardOptions;
	}
	public static void shuffleDeck(){
		Random rgen = new Random();
		lastDeck = Arrays.copyOf(newDeck, newDeck.length);

		for(int i = 0; i < 4; i++){
			System.out.println("I:" + i);	
			for(int y = 0; y < cardOptions.length; y++){
				Arrays.fill(usedCards, null);
				System.out.println("Y:" + y);
				int x = rgen.nextInt(cardOptions.length);
				System.out.println("Randomly Generated Card Position is: " + x);
				if(Arrays.asList(usedCards).contains(Integer.toString(x))) {
					System.out.println("The value of X is already in the array! The usedCards array is " + (Arrays.toString(usedCards)));
					y = y-1;
				}
				else {
					if(i == 0){
						suit = "d";
					} else if(i == 1){
						suit = "h";
					} else if(i == 2){
						suit = "s";
					} else if(i == 3){
						suit = "c";
					}
					usedCards = Arrays.copyOf(usedCards, usedCards.length + 1);
					usedCards[y] = Integer.toString(x) + suit;
					newDeck[y] = cardOptions[x] + suit;
				}
			}
		}
	}
	public static void printDeck() {
		for (int i = 0; i < newDeck.length; i++) {
        	if (i > 0) {
           		System.out.print(", ");
        	}
        	System.out.print(newDeck[i]);
     	}
	}

	public static void main(String[] args) {
		shuffleDeck();
		printDeck();
	}
}