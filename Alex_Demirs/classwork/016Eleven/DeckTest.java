
import java.util.*;

class Deck {


	private static final String[] fulldeck_Suits = {"Spades", "Diamonds", "Clubs", "Hearts"};
	private static final String[] fulldeck_Values = {"Aces", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

	private static final String[] default_suit_Ranks = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private static final String[] default_Value_Ranks = {"Aces", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


	public String[] chosen_Suits = fulldeck_Suits;
	public String[] chosen_Values = fulldeck_Values;


	public String[] chosen_suit_Ranks = default_suit_Ranks;
	public String[] chosen_Value_Ranks = default_Value_Ranks;


	private Card[] deck = new Card[chosen_Suits.length * chosen_Values.length];
	private Card[] deck2 = new Card[chosen_Suits.length * chosen_Values.length];
	private Card[] shuffled_deck = new Card[chosen_Suits.length * chosen_Values.length];

	private int card_num = -1;

	
	public Deck(String[] Suits, String[] Values, String[] suit_Ranks, String[] Value_Ranks) {
		createDeck(Suits, Values, suit_Ranks, Value_Ranks);
		shuffleDeck(deck2);
	}

	public Deck() {
		this(fulldeck_Suits, fulldeck_Values, default_suit_Ranks, default_Value_Ranks);
		shuffleDeck(deck2);
	}
	
	public Card[] getDeck() {
		return deck;
	}

	public void setDeck(Card[] a) {
		deck = a;
	}

	public Card[] getShuffledDeck() {
		return shuffled_deck;
	}

	public void setShuffledDeck(Card[] a) {
		shuffled_deck = a;
	}

	public String[] getFullDeckSuits() {
		return fulldeck_Suits;
	}

	public String[] getFullDeckValues() {
		return fulldeck_Values;
	}

	public String[] getDefaultSuitRanks() {
		return default_suit_Ranks;
	}

	public String[] getDefaultValueRanks() {
		return default_Value_Ranks;
	}

	
	public void setChosen(String[] Suits, String[] Values) {
		chosen_Suits = Suits;
		chosen_Values = Values;
	}

	public void setRanks(String[] suit_Ranks, String[] Value_Ranks) {
		chosen_suit_Ranks = suit_Ranks;
		chosen_Value_Ranks = Value_Ranks;
	}

	public void createDeck(String[] Suits, String[] Values, String[] suit_Ranks, String[] Value_Ranks) {
		setChosen(Suits, Values);
		setRanks(suit_Ranks, Value_Ranks);
		for (int i = 0; i < chosen_Suits.length; i++) {
			for (int j = 0; j < chosen_Values.length; j++) {
				deck[(i * chosen_Values.length) + j] = new Card(chosen_Values[j], chosen_Suits[i], false);
				deck2[(i * chosen_Values.length) + j] = new Card(chosen_Values[j], chosen_Suits[i], false);
				
			}
		}
	}

	public void displayDeck(Card[] d) {
		for (int i = 0; i < d.length; i++) {
			d[i].printCard(d[i]);
		}
	}

	public Card[] returnDeck() {
		return deck;
	}

	private boolean compareValue(Card first_card, Card second_card) {
		int anum = -1;
		int bnum = -1;
		for (int i = 0; i < chosen_Value_Ranks.length; i++) {
			if (first_card.getNumber().equals(chosen_Value_Ranks[i])) {
				anum = i;
			}
			if (second_card.getNumber().equals(chosen_Value_Ranks[i])) {
				bnum = i;
			}
		}
		if (anum > bnum) {
			
			return true;
		} else if (anum < bnum) {
			
			return false;
		} else {
			return compareSuit(first_card, second_card);
		}
	}

	
	private boolean compareSuit(Card first_card, Card second_card) {
		int asuit = -1;
		int bsuit = -1;
		for (int i = 0; i < chosen_suit_Ranks.length; i++) {
			if (first_card.getSuit().equals(chosen_suit_Ranks[i])) {
				asuit = i;
			}
			if (second_card.getSuit().equals(chosen_suit_Ranks[i])) {
				bsuit = i;
			}
		}
		if (asuit > bsuit) {
			
			return true;
		} else {
			
			return false;
		}
	}

	
	public boolean isHigher(Card first_card, Card second_card) {
		return compareValue(first_card, second_card);
	}


	public void shuffleDeck(Card[] d) { 
		List<Card> list = Arrays.asList(d);
		Collections.shuffle(list);
		shuffled_deck = list.toArray(new Card[list.size()]);
		
	}

	public boolean sameOrder(Card[] decka, Card[] deckb) {
		for (int i = 0; i < decka.length; i++) {
			if (!decka[i].isEqual(decka[i], deckb[i])) {
				return false;
			}
		}
		return true;	
	}

	public Card dealCard() {
		card_num++;
		shuffled_deck[card_num].printCard(shuffled_deck[card_num]);
		return shuffled_deck[card_num];
	}
}
