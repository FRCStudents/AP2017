// Deck
import java.util.Random;

class Deck{
  private String [] rankArray = new String[13];
  private String [] suitArray = new String[4];
  private int [] valueArray = new int[13];
  private Card[] cards = new Card[52];

  //this pointer allows us to deal the next card
  private int nextCard = 0;

  //these pointers allow us to manipulate arrays without
  //checking for null values...

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
      //String[] r ={"A", "B", "C"};
      //String[] s = {"Spades", "Hearts", "Diamonds"};
      //int[] v = {1,2,3, 4};
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
      nextCard--;
      maxCard = nextCard;
  }

  public void showDeck(){
    for(int i=0; i < cards.length; i++){
      if(cards[i] == null) continue;
      System.out.println((i+1) + ":" + cards[i] + cards[i].displaySuit(cards[i]));
    }
  }

  public int deckSize(){
    return nextCard;
  }

  public Card dealCard(){
      if(nextCard < 0) return null;
      nextCard--;
      return cards[nextCard+1];
  }

  public void resetDeal(){
    nextCard = maxCard;
  }

  // nextCard is decremented then card is dealt -
  // it is always pointing at the last card dealth
  public boolean isEmpty(){
      return nextCard <= 0;
  }

  // produces copy of this Deck
  public Deck getCopy(){
    Deck newDeck = new Deck(getRankArray(), getSuitArray(), getValueArray(), getCards());
    return newDeck;
  }

  // returns true/false in case or is the same or not
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

  //==================================================================================
  // shuffling the deck - different strategies - begin strategy 1
  //==================================================================================
  // this is going to be an inverse selection sort:
  // get the first card
  // get a random card
  // swap the cards...
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
      //System.out.println("Swapping: " + spot);
      Card hold = getFirst();
      setCard(getCard(spot), 0);
      setCard(hold, spot);
  }

  private void selectAndSwapShuffle(){
    for(int i=1; i < maxCard-1; i++)
        swapCards(i);
  }
  //==================================================================================
  // shuffling the deck - different strategies - end strategy 1
  //==================================================================================

  //==================================================================================
  // shuffling the deck - different strategies - begin strategy 2
  //==================================================================================
  private void splitAndReturn(Card[] leftHand, Card[] rightHand, int midPoint){
    int WDPointer = 0;
    int LPointer = 0;
    int RPointer = 0;
    //split
    //System.out.println("midPoint: " + midPoint);
    for(int i=0; i < midPoint; i++){
        leftHand[LPointer] = cards[i];
        LPointer++;
      }
    for(int i=midPoint; i < maxCard; i++){
        rightHand[RPointer] = cards[i];
        RPointer++;
      }

    for(int i=0; i < midPoint; i++){
      cards[WDPointer] = leftHand[i];
      WDPointer += 2;
    }
    WDPointer = 1;
    for(int i=0; i < midPoint; i++){
      cards[WDPointer] = rightHand[i];
      WDPointer += 2;
    }
  }

  private void shufflePerfect(){
    // divide the cards in half, then interweave
    int size = maxCard;
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
    splitAndReturn(leftHand, rightHand, midPoint);
  }

  //==================================================================================
  // shuffling the deck - different strategies - end strategy 2
  //==================================================================================

  public void shuffle(int times){
    //note: 8 shuffles is back to where it originated!
    for(int i=0; i < times; i++){
      //shufflePerfect();
      selectAndSwapShuffle();
    }
  }
}
