public class Card {
  private char suit;
  private String faceValue;
  private boolean isFaceDown;

  public Card(String fV, String s) {
      this.faceValue = fV;
      this.isFaceDown = true;
      switch (s) {
          case "Spades":
            this.suit = 's';
            break;
          case "Diamonds":
            this.suit = 'd';
            break;
          case "Clubs":
            this.suit = 'c';
            break;
          case "Hearts":
            this.suit = 'h';
            break;
      }
  }
  public Card(){
    this.faceValue = "Error";
    this.isFaceDown = false;
  }
  public char getSuit(){
    return this.suit;
  }
  public String getFaceValue(){
    return this.faceValue;
  }
  public boolean getIsFaceDown(){
    return this.isFaceDown;
  }
  public String toString(){
    return "Value: " + this.faceValue + "  Suit: " + this.suit;
  }
}
