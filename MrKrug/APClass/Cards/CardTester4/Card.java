public class Card {
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
    //System.out.println("isEqual: " + card1 + " and: " + card2);
    if(card1.rank.equals(card2.rank) && card1.suit.equals(card2.suit)){
      return true;
    }
    return false;
  }

  public void getRandomValue(){
    rank = int2Rank(getRandom(13));
    suit = int2Suit(getRandom(4));
    assignPoints();
  }
}
