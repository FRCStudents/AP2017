public class Card{

private	int Number;
private	String Suit;
private	int Rank;

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

public boolean isEqual(Card c){
	return getNumber() == Number;
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
