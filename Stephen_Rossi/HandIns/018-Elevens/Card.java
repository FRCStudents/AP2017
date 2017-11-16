public class Card {
  private char suit;
  private int value;
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
          default:
            this.suit = 'E';
            break;
      }
      switch (fV) {
          case "2":
            this.value = 2;
            break;
          case "3":
            this.value = 3;
            break;
          case "4":
            this.value = 4;
            break;
          case "5":
            this.value = 5;
            break;
          case "6":
            this.value = 6;
            break;
          case "7":
            this.value = 7;
            break;
          case "8":
            this.value = 8;
            break;
          case "9":
            this.value = 9;
            break;
          case "10":
            this.value = 10;
            break;
          case "Ace":
            this.value = 1;
            break;
          case "Queen":
            this.value = -1;
            break;
          case "Jack":
            this.value = -1;
            break;
          case "King":
            this.value = -1;
            break;
          default:
            this.value = -999;
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
  public int getValue(){
    return this.value;
  }
  public boolean getIsFaceDown(){
    return this.isFaceDown;
  }
  public String toString(){
    return "Value: " + this.value + "  Suit: " + this.suit + "  FaceValue: " + this.faceValue;
  }
  public void flip(){
    isFaceDown = !isFaceDown;
  }
}
