public class Card{

private	int Number;
private	String Suit;
private	int Rank;
private Boolean Value;

public Card(){
	Number = 2;
	Suit = "Spades";
	Rank = 1;
}

//setters and getters
public int getNumber(){
	return Number;
}
public void setNumber(int currentNumber){
	Number = currentNumber;
}
public String getSuit(){
	return Suit;
}
public void setSuit(String currentSuit){
	Suit = currentSuit;
}

public int getRank(){
	return Rank;
}
public void setRank(int currentRank){
	Rank = currentRank;
}

public boolean getValue(){
	return Value;
}

public void setValue(boolean currentValue){
	Value = currentValue;
}

public char displaySuit(String c) {
              switch (c) {
                  case "Spades":
                      return ((char)'S');
                  case "Diamonds":
                      return ((char)'D');
                  case "Clubs":
                      return ((char)'C');
                  case "Hearts":
                      return ((char)'H');
              }
              return ' ';
      }


public boolean isEqual(Card c) {
        return ((c.getSuit().equals(Suit)) && (c.getNumber().equals(Number)) && (c.getValue() == Value));
        System.out.Println(Value);
    }

public void printCard(){
	System.out.println("Suit" + " " + displaySuit(Suit) + " " + Suit);
	System.out.println("Rank" + " " + Rank);
	System.out.println("Number" + " " + Number);

}
public boolean ishigher(int Rank){
	return getRank() > Rank;
}

public String toString(){
	return "Card" + " " + "Suit:" + " " + Suit + " " + "Number:" + " " + Number + " " + "Rank:" + " " + Rank;
}
}
