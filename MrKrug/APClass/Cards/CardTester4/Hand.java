public class Hand {
  Card [] hand;
  int totalPoints;
  int distributionPoints;
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

  public int getDistributionPoints(){
    return distributionPoints;
  }

  public void totalPoints(){
    int totalPoints = 0;
    for(int i=0; i < size; i++){
      totalPoints += hand[i].getPoints();
    }
    this.totalPoints = totalPoints;
  }

  public void distributionPoints(){
    int countSpades = 0;
    int countHearts = 0;
    int countDiamonds = 0;
    int countClubs = 0;

    for(int i=0; i < size; i++){
      if(hand[i].getSuit().equals("Spades")) countSpades++;
      if(hand[i].getSuit().equals("Hearts")) countHearts++;
      if(hand[i].getSuit().equals("Diamonds")) countDiamonds++;
      if(hand[i].getSuit().equals("Clubs")) countClubs++;
    }
    /* points for doubleton */
    if(countSpades == 2) distributionPoints+=1;
    if(countHearts == 2) distributionPoints+=1;
    if(countDiamonds == 2) distributionPoints+=1;
    if(countClubs == 2) distributionPoints+=1;

    /* points for singleton */
    if(countSpades == 1) distributionPoints+=2;
    if(countHearts == 1) distributionPoints+=2;
    if(countDiamonds == 1) distributionPoints+=2;
    if(countClubs == 1) distributionPoints+=2;

    /* points for void */
    if(countSpades == 0) distributionPoints+=3;
    if(countHearts == 0) distributionPoints+=3;
    if(countDiamonds == 0) distributionPoints+=3;
    if(countClubs == 0) distributionPoints+=3;
  }

  public String toString(){
    String s = "";
    String suit = "";
    for(int i=0; i < size; i++){
      if(!hand[i].getSuit().equals(suit)){
        s += "\n\n\t-------" + hand[i].getSuit().toUpperCase() + "---------";
        suit = hand[i].getSuit();
      }
      s += "\n\t" + hand[i].toString();
    }
    return s;
  }

  public void orderHandNum(){
    Card[] temp = new Card[size];
      int handPointer = 0;
      for(int i=0; i < size; i++){
          if(hand[i].getRank().equals("Ace")){
            temp[handPointer++] = hand[i];
          }
      }

      for(int i=0; i < size; i++){
          if(hand[i].getRank().equals("King")){
            temp[handPointer++] = hand[i];
          }
      }
      for(int i=0; i < size; i++){
          if(hand[i].getRank().equals("Queen")){
            temp[handPointer++] = hand[i];
          }
      }
      for(int i=0; i < size; i++){
          if(hand[i].getRank().equals("Jack")){
            temp[handPointer++] = hand[i];
          }
      }

      /* don't bother sorting the value cards */
      for(int i=0; i < size; i++){
          if(!hand[i].getRank().equals("Jack") &&
              !hand[i].getRank().equals("Queen") &&
              !hand[i].getRank().equals("King") &&
              !hand[i].getRank().equals("Ace")){
            temp[handPointer++] = hand[i];
          }
      }

      for(int i=0; i < size; i++){
            hand[i] = temp[i];
      }
  }


  public void orderHand(){
    Card[] temp = new Card[size];
      int handPointer = 0;
      for(int i=0; i < size; i++){
          if(hand[i].getSuit().equals("Spades")){
            temp[handPointer++] = hand[i];
          }
      }
      for(int i=0; i < size; i++){
          if(hand[i].getSuit().equals("Hearts")){
            temp[handPointer++] = hand[i];
          }
      }
      for(int i=0; i < size; i++){
          if(hand[i].getSuit().equals("Diamonds")){
            temp[handPointer++] = hand[i];
          }
      }
      for(int i=0; i < size; i++){
          if(hand[i].getSuit().equals("Clubs")){
            temp[handPointer++] = hand[i];
          }
      }
      for(int i=0; i < size; i++){
            hand[i] = temp[i];
      }
  }

  public void display(Card[] stack){
    for (int i=0; i<stack.length; i++){
      System.out.println(i + ":" + stack[i]);
    }
  }

}
