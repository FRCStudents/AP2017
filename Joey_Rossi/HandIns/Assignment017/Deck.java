import java.util.*;

class Deck {

  private static final String[] fulldeck_suits = {"Spades", "Diamonds", "Clubs", "Hearts"};
  private static final String[] fulldeck_values = {"Aces", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

  private static final String[] default_suit_ranks = {"Clubs", "Diamonds", "Hearts", "Spades"};
  private static final String[] default_value_ranks = {"Aces", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

  public String[] chosen_suits = fulldeck_suits;
  public String[] chosen_values = fulldeck_values;

  public String[] chosen_suit_ranks = default_suit_ranks;
  public String[] chosen_value_ranks = default_value_ranks;

  private Card[] deck = new Card[chosen_suits.length * chosen_values.length];
  private Card[] deck2 = new Card[chosen_suits.length * chosen_values.length]; 
  private Card[] shuffled_deck = new Card[chosen_suits.length * chosen_values.length];

  private int card_num = -1;

  public Deck(String[] suits, String[] values, String[] suit_ranks, String[] value_ranks) {
    createDeck(suits, values, suit_ranks, value_ranks);
    shuffleDeck(deck2);
  }

  public Deck() {
    this(fulldeck_suits, fulldeck_values, default_suit_ranks, default_value_ranks);
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

  public String[] getFullDeckSuits() { // no setter b/c final
    return fulldeck_suits;
  }

  public String[] getFullDeckValues() {
    return fulldeck_values;
  }

  public String[] getDefaultSuitRanks() {
    return default_suit_ranks;
  }

  public String[] getDefaultValueRanks() {
    return default_value_ranks;
  }

  public void setChosen(String[] suits, String[] values) {
    chosen_suits = suits;
    chosen_values = values;
  }

  public void setRanks(String[] suit_ranks, String[] value_ranks) {
    chosen_suit_ranks = suit_ranks;
    chosen_value_ranks = value_ranks;
  }
  
  public void createDeck(String[] suits, String[] values, String[] suit_ranks, String[] value_ranks) {
    setChosen(suits, values);
    setRanks(suit_ranks, value_ranks);
    for (int i = 0; i < chosen_suits.length; i++) {
      for (int j = 0; j < chosen_values.length; j++) {
        deck[(i * chosen_values.length) + j] = new Card(chosen_values[j], chosen_suits[i], false);
        deck2[(i * chosen_values.length) + j] = new Card(chosen_values[j], chosen_suits[i], false);
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
    for (int i = 0; i < chosen_value_ranks.length; i++) {
      if (first_card.getNumber().equals(chosen_value_ranks[i])) {
        anum = i;
      }
      if (second_card.getNumber().equals(chosen_value_ranks[i])) {
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
    for (int i = 0; i < chosen_suit_ranks.length; i++) {
      if (first_card.getSuit().equals(chosen_suit_ranks[i])) {
        asuit = i;
      }
      if (second_card.getSuit().equals(chosen_suit_ranks[i])) {
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