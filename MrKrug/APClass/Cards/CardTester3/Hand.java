public class Hand {
  Card [] hand;
  int totalPoints;
  int size;

  public Hand(){
    this(5);
  }

  public Hand(int size){
    hand = new Card[size];
    this.size = size;
    for(int i=0; i < size; i++){
      hand[i] = new Card();
    }
  }

  public boolean checkCards(){
    for(int i=0; i<size; i++)
      for(int j=i+1; j < size; j++){
        //System.out.println("checkCards: " + hand[i] + " and: " + hand[j]);
        if(hand[0].isEqual(hand[i], hand[j]))
          return false;
      }

      return true;
  }

  public Card[] getHand(){
    return hand;
  }

  public int getTotalPoints(){
    return totalPoints;
  }

  public void totalPoints(){
    int totalPoints = 0;
    for(int i=0; i < size; i++){
      totalPoints += hand[i].getPoints();
    }
    this.totalPoints = totalPoints;
  }

  public String toString(){
    String s = "";
    for(int i=0; i < size; i++){
      s += "\n" + hand[i].toString();
    }
    return s;
  }
}
