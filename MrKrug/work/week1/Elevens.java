/*
 * Elevens.java
/******************************************************
 * AP Eleven's - as coded by yours truly...
 ******************************************************/

class Card {
    /* values: 1 - 13 => A - K */
    private int value;
    /* "Spades", "Hearts", "Diamonds", "Clubs" */
    private String suit;

    public Card(){
        this(1, "Spades");
        //System.out.println("Default Constructor");
    }

    public Card(int value, String suit){
       this.value = value;
       this.suit = suit;
    }

    public int getValue(){
      return value;
    }

    public void setValue(int value){
      this.value = value;
    }

    /*
	Notice what happens if I change the name to to_string,
        and then run the program. 
          
	How would you describe the difference?
	Can you take a stab at explaining it?
	WEIRD!!!!
    */

    public String toString(){
        return "Card: [Value = " + this.value + "]\t[Suit = " + this.suit + "]";
    }
}

public class Elevens{

  public static void main(String [] argv){
    String s;
    Card c, c2;
    /* instantiate a card */
    c = new Card();
    System.out.println(c);
    c2 = new Card(5, "Hearts");
    System.out.println(c2);
  }
}
