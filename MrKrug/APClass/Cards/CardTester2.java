/**************************************************************************************************
* 1. Complete the implementation of the Card class.
*
* You will be required to complete:
*
*     a constructor that takes two String parameters that represent the card’s
*		 rank and suit, and an int parameter that represents the point value of the card;
*
*     accessor methods for the card’s rank, suit, and point value;
*
*    a method to test equality between two card objects; and d. the toString method
*		to create a String that contains the rank, suit, and point value of the card object.
*		The string should be in the following format: rank of suit (point value = pointValue)
*
*
*
* 2. Once you have completed the Card class, complete the CardTester.java file.
* Create three Card objects and test each method for each Card object.
***********************************************************************************************/
class Card {
  /* attributes */
  private String rank;
  private String suit;
  private int points;

  /* constructor */
  public Card(){
    getRandomValue();
  }

  public Card(String rank, String suit){
    setRank(rank);
    setSuit(suit);
    assignPoints();
  }

  public String getRank(){
    return rank;
  }

  public String getSuit(){
    return suit;
  }

  public int getPoints(){
    return points;
  }

  public void setRank(String rank){
    this.rank = rank;
  }

  public void setSuit(String suit){
    this.suit = suit;
  }

  public void setPoints(int points){
    this.points = points;
  }

  public String toString(){
    return rank + " of " + suit + " (point value = " + points + ")";
  }

  public String int2Suit(int s){
    if(s == 1) return "Spades";
    if(s == 2) return "Hearts";
    if(s == 3) return "Diamonds";
    if(s == 4) return "Clubs";
    return "Unknown";
  }

  public String int2Rank(int r){
    if(r == 1) return "Ace";
    if(r == 2) return "Two";
    if(r == 3) return "Three";
    if(r == 4) return "Four";
    if(r == 5) return "Five";
    if(r == 6) return "Six";
    if(r == 7) return "Seven";
    if(r == 8) return "Eight";
    if(r == 9) return "Nine";
    if(r == 10) return "Ten";
    if(r == 11) return "Jack";
    if(r == 12) return "Queen";
    if(r == 13) return "King";
    return "Unknown";
  }

  public void assignPoints(){
      points = 0;
      if(rank.equals("Ace")) points = 4;
      if(rank.equals("King")) points = 3;
      if(rank.equals("Queen")) points = 2;
      if(rank.equals("Jack")) points = 1;
  }

  /* get random from 1 to possibilities */
  public int getRandom(int possibilites){
    return 1 + (int)(Math.random() * possibilites);
  }

  public boolean isEqual(Card card){
    if(this.rank.equals(card.rank) && this.suit.equals(card.suit)){
      return true;
    }
    return false;
  }

  public boolean isEqual(Card card1, Card card2){
    if(card1.rank.equals(card2.rank) && card1.suit.equals(card2.suit)){
      return true;
    }
    return false;
  }

 /* This looks really stupid! Is there a better way to code this? */
  public boolean checkCards(Card c1, Card c2, Card c3, Card c4, Card c5){
      if(isEqual(c1, c2)) return false;
      if(isEqual(c1, c3)) return false;
      if(isEqual(c1, c4)) return false;
      if(isEqual(c1, c5)) return false;
      if(isEqual(c2, c3)) return false;
      if(isEqual(c2, c4)) return false;
      if(isEqual(c2, c5)) return false;
      if(isEqual(c3, c4)) return false;
      if(isEqual(c3, c5)) return false;
      if(isEqual(c4, c5)) return false;
      return true;
  }

  /* This looks really stupid! Is there a better way to code this? */
   public int totalPoints(Card c1, Card c2, Card c3, Card c4, Card c5){
      return c1.getPoints() + c2.getPoints() + c3.getPoints() + c4.getPoints() + c5.getPoints();
   }

  public void getRandomValue(){
    rank = int2Rank(getRandom(13));
    suit = int2Suit(getRandom(4));
    assignPoints();
  }
}

/**
 * This is a class that tests the Card class.
 */
public class CardTester2 {
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
    Card c1 = new Card();
    Card c2 = new Card();
    Card c3 = new Card();
    Card c4 = new Card();
    Card c5 = new Card();

    while(!c1.checkCards(c1,c2,c3,c4,c5)) {
      c2.getRandomValue();
      c3.getRandomValue();
      c4.getRandomValue();
      c5.getRandomValue();
    }

    System.out.println("Card 1: " + c1);
    System.out.println("Card 2: " + c2);
    System.out.println("Card 3: " + c3);
    System.out.println("Card 4: " + c4);
    System.out.println("Card 5: " + c5);

    System.out.println("Total Points: " + c1.totalPoints(c1,c2,c3,c4,c5));
	}
}
