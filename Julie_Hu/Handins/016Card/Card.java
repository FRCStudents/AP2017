import java.util.*;
public class Card{
	int Number;
	String Suit;
	int Rank;
	
	int getRank(){
		return Rank;
	}
	void setRank(int newRank){
		Rank = newRank;
	}
	
	int getNumber(){
		return Number;
	}
	void setNumber(int newNumber){
		Number = newNumber; 
	}
	String getSuit(){
		return Suit; 
	}
	void setSuit(String newSuit){
		Suit = newSuit;
	}
	void printCard(){
		System.out.println("Number: " + Number);
		System.out.println("Suit: " + Suit + displaySuit(Suit));
	}

	public char displaySuit(String c) {
              switch (c) {
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

}
