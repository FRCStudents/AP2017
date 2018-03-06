import java.util.Random;

class Deck{
  private String [] rankArray = new String[13];
  private String [] suitArray = new String[4];
  private int [] valueArray = new int[13];
  private Card[] cards = new Card[52];

  //this pointer allows us to deal the next card
  private int nextCard = 0;

  //these pointers allow us to manipulate arrays without

  private int maxSuit = -1;
  private int maxRank = -1;
  private int maxValue = -1;
  private int maxCard = -1;
  
  //*****************************************
  //Constructors: 

  public Deck(String[] r, String[] s, int[] v){
    int i=0;
    maxRank = r.length - 1;
    maxSuit = s.length - 1;
    maxValue = v.length - 1;

    setRankArray(r);
    setSuitArray(s);
    setValueArray(v);

    createDeck();
  }

  public Deck(String[] r, String[] s, int[] v, Card[] c){
    int i=0;
    maxRank = r.length - 1;
    maxSuit = s.length - 1;
    maxValue = v.length - 1;

    setRankArray(r);
    setSuitArray(s);
    setValueArray(v);
    setCards(c);
  }

  public Deck(){
      String[] r ={"A", "B", "C", "D"};
      String[] s = {"Spades", "Hearts", "Diamonds", "Clubs"};
      int[] v = {1,2,3,4,5,6,7,8,9,10,11,12,13};

      maxRank = r.length - 1;
      maxSuit = s.length - 1;
      maxValue = v.length - 1;

      setRankArray(r);
      setSuitArray(s);
      setValueArray(v);

      createDeck();
  }
//*************************************
  //end constructors
  //
  //Getters and setters:
  //
  //setter and getter for rank array:
  
  public void setRankArray(String[] r){
    for(int i=0; i < r.length; i++){
      rankArray[i] = r[i];
    }
  }
  public String[] getRankArray(){
    return rankArray;
  }

  //getters and setters for suit array:
  public void setSuitArray(String[] s){
    for(int i=0; i < s.length; i++){
      suitArray[i] = s[i];
    }
  }
  public String[] getSuitArray(){
    return suitArray;
  }
  
  //getters and setters for value array
  public void setValueArray(int[] v){
    for(int i=0; i < v.length; i++){
      valueArray[i] = v[i];
    }
  }
  public int[] getValueArray(){
    return valueArray;
  }
  
  //setters and getters for cards array
  public void setCards(Card[] c){
    for(int i=0; i < c.length; i++){
      cards[i] = c[i];
    }
  }
  public Card[] getCards(){
    return cards;
  }
  
  //**********************************************************
  //Methods (from suggested Part II handout)

  //first method: Create the Deck
  public void createDeck(){
    for(int i=0; i <= maxValue; i++){
      for(int j=0; j <= maxSuit; j++){
        cards[nextCard] = new Card(rankArray[j], suitArray[j], valueArray[i]);
        nextCard++;
        }
      }
      nextCard--;
      maxCard = nextCard;
  }

  //second method: display the deck (print it out)
  public void displayDeck(){
    for(int i=0; i < cards.length; i++){
      if(cards[i] == null) continue;
      System.out.println((i+1) + ":" + cards[i] + cards[i].displaySuit(cards[i]));
    }
  }

//method card dealCard
  public Card dealCard(){
      if(nextCard < 0) return null;
      nextCard--;
      return cards[nextCard+1];
  }

  // boolean method to check if the decks are the same (They shouldn't be!)
  public boolean sameOrder(Deck d){
      Card[] c = getCards();
      Card[] c2 = d.getCards();

      if(c.length != c2.length) return false;

      for(int i=0; i<c.length; i++){
        if(c[i] != null && c2[i] != null)
          if(!c[i].isEqual(c2[i]))
            return false;
      }
      return true;
  }
  
//shuffleDeck method  
  private Card getFirst(){
    return cards[0];
  }

  private Card getCard(int position){
    return cards[position];
  }

  private void setCard(Card c, int position){
    cards[position] = c;
  }

  private int getRandomSpot(int mCard){
    return (int)(Math.random() * mCard);
  }

  private void swapCards(int start){
      int choices = maxCard - start;
      int spot = getRandomSpot(choices) + start;
      Card hold = getFirst();
      setCard(getCard(spot), 0);
      setCard(hold, spot);
  }

  private void selectAndSwapShuffle(){
    for(int i=1; i < maxCard-1; i++)
        swapCards(i);
  }

  public void shuffle(int times){
    for(int i=0; i < times; i++){
      selectAndSwapShuffle();
    }
  }
}
