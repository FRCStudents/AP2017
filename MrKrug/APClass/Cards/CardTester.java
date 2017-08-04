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
}

/**
 * This is a class that tests the Card class.
 */
public class CardTester {
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

    System.out.println("Card 1: " + c1);
    System.out.println("Card 2: " + c2);
    System.out.println("Card 3: " + c3);
    System.out.println("Card 4: " + c4);
    System.out.println("Card 5: " + c5);

System.out.println("Total Points: " + c1.totalPoints(c1,c2,c3,c4,c5));
	}
}
