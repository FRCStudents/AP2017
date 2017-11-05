// Deck
class Deck{
  private String [] rankArray = new String[13];
  private String [] suitArray = new String[4];
  private int [] valueArray = new int[13];
  private Card[] cards = new Card[52];

  private int nextCard = 0;
  private int maxSuit = -1;
  private int maxRank = -1;
  private int maxValue = -1;
  private int maxCard = -1;

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
      String[] r ={"A", "B"};
      String[] s = {"Spades", "Hearts"};
      int[] v = {1,2};
  //    String[] r ={"A", "B", "C", "D"};
  //    String[] s = {"Spades", "Hearts", "Diamonds", "Clubs"};
  //    int[] v = {1,2,3,4,5,6,7,8,9,10,11,12,13};

      maxRank = r.length - 1;
      maxSuit = s.length - 1;
      maxValue = v.length - 1;

      setRankArray(r);
      setSuitArray(s);
      setValueArray(v);

      createDeck();
  }

  public void setRankArray(String[] r){
    for(int i=0; i < r.length; i++){
      rankArray[i] = r[i];
    }
  }

  public void setSuitArray(String[] s){
    for(int i=0; i < s.length; i++){
      suitArray[i] = s[i];
    }
  }

  public void setValueArray(int[] v){
    for(int i=0; i < v.length; i++){
      valueArray[i] = v[i];
    }
  }

  public void setCards(Card[] c){
    for(int i=0; i < c.length; i++){
      cards[i] = c[i];
    }
  }

  public String[] getRankArray(){
    return rankArray;
  }

  public String[] getSuitArray(){
    return suitArray;
  }

  public int[] getValueArray(){
    return valueArray;
  }

  public Card[] getCards(){
    return cards;
  }


  private void createDeck(){
    for(int i=0; i <= maxValue; i++){
      for(int j=0; j <= maxSuit; j++){
        cards[nextCard] = new Card(rankArray[j], suitArray[j], valueArray[i]);
        nextCard++;
        }
      }
  }

  public void showDeck(){
    for(int i=0; i < cards.length; i++){
      //if(cards[i] == null) continue;
      System.out.println(cards[i]);
    }
  }

  public Card dealCard(){
      nextCard--;
      return cards[nextCard+1];
  }

  // nextCard is decremented then card is dealt -
  // it is always pointing at the last card dealth
  public boolean isEmpty(){
      return nextCard == 0;
  }

  public Deck copyDeck(Deck d){
    Deck newDeck = new Deck( d.getRankArray(), d.getSuitArray(), d.getValueArray(), d.getCards());
    return newDeck;
  }

  public boolean sameOrder(Deck d){
      Card[] c = getCards();
      Card[] c2 = d.getCards();

      if(c.length != c2.length) return false;

      for(int i=0; i<c.length; i++){
        if(!c[i].isEqual(c2[i])) return false;
      }
      return true;
  }

  // shuffling the deck - different strategies
  private void splitAndReturn(Card[] leftHand, Card[] rightHand, Card[] wholeDeck, int midPoint){
    int WDPointer = 0;
    int LPointer = 0;
    int RPointer = 0;
    //split
    for(int i=0; i < midPoint; i++){
        leftHand[LPointer] = wholeDeck[i];
        LPointer++;
      }
    for(int i=midPoint; i < wholeDeck.length; i++){
        rightHand[RPointer] = wholeDeck[i];
        RPointer++;
      }

    for(int i=0; i < leftHand.length; i++){
      wholeDeck[WDPointer] = leftHand[i];
      WDPointer += 2;
    }
    WDPointer = 1;
    for(int i=0; i < rightHand.length; i++){
      wholeDeck[WDPointer] = rightHand[i];
      WDPointer += 2;
    }
  }

  private void shufflePerfect(){
    // divide the cards in half, then interweave
    int size = cards.length;

    // midPoint exclusive for left hand, starts right hand...
    // e.g. deckSize = 4 {0,1,2,3} = midPoint = 2;
    //      left - {0, 1} and right {2, 3}

    int midPoint = 0;

    Card[] leftHand;
    Card[] rightHand;
    if(size % 2 == 0){
      leftHand = new Card[size/2];
      rightHand = new Card[size/2];
      midPoint = size/2;
    } else {
      leftHand = new Card[(size + 1)/2];
      rightHand = new Card[(size + 1)/2];
      midPoint = (size + 1)/2;
    }
    splitAndReturn(leftHand, rightHand, cards, midPoint);
  }

  public void shuffle(int times){
    //note: 8 shuffles is back to where it originated!
    for(int i=0; i < times; i++){
      shufflePerfect();
    }
  }
}
