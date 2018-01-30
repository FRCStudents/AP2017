//Card
//
class Card {
      String rank;
      String suit;
      int    value;

      public Card(String r, String s, int v){
        rank = r;
        suit = s;
        value = v;
      }

      public Card(Card c){
	this(c.getRank(), c.getSuit(), c.getValue());
      }

      public Card(){
        this("Ace", "Spades", 1);
      }

      public char displaySuit(Card c) {
              switch (c.getSuit()) {
                  case "Spades":
                      return ((char)'\u2660');
                  case "Diamonds":
                      return ((char)'\u2666');
                  case "Clubs":
                      return ((char)'\u2663');
                  case "Hearts":
                      return ((char)'\u2764');
              }
              return ' ';
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
        return c.getRank().equals(getRank()) &&
                c.getSuit().equals(getSuit()) &&
                c.getValue() == getValue();
      }

      public void printCard(){
          String s = "";
          int v = getValue();
          if(v == 11) s = "J";
          if(v == 12) s = "Q";
          if(v == 13) s = "K";
          if(v == 1) s = "A";

          if((v > 1) && (v < 11))
              System.out.print("\t" + v + displaySuit(this));
          else
              System.out.print("\t" + s + displaySuit(this));
      }

      public String toString(){
        return "Card: {rank: " + getRank() + "} {suit: " + getSuit() + "} {value: " + getValue() + "}";
      }
}
