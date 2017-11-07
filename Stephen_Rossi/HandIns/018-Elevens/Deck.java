public class Deck{
  final String[] values = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
  final String[] suits = {"Spades","Diamonds","Hearts","Clubs"};

  private Card[] deck = new Card[suits.length * values.length];

  public Deck(){
    for(int s = 0; s < suits.length; s++){
      for(int v = 0; v < values.length; v++){
        deck[(s * values.length + v)] = new Card(values[v], suits[s]);
      }
    }
  }
  public Card getCard(int idx){
    return deck[idx];
  }
  public void shuffleDeck(){
    System.out.println("xd");
  }
  public int getLength(){
    return deck.length;
  }

}
