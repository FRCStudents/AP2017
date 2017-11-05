//Card
class Card {
      String rank;
      String suit;
      int    value;

      public Card(String r, String s, int v){
        rank = r;
        suit = s;
        value = v;
      }

      public Card(){
        this("Ace", "Spades", 1);
      }

      public String getRank(){
        return rank;
      }

      public String getSuit(){
        return suit;
      }

      public int getValue(){
        return value;
      }

      public boolean isEqual(Card c){
        return c.getRank().equals(getRank()) && c.getSuit().equals(getSuit()) && c.getValue() == getValue();
      }

      public String toString(){
        return "Card: {rank: " + getRank() + "} {suit: " + getSuit() + "} {value: " + getValue() + "}";
      }
}
